package com.drone.application.gui;

/**------------------------------------------------------------------------------------------------------------------------------------------------------------
* The MainScreenController class controls the functional aspects to
* displays MainScreen UI to the standard stage.
*
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29
* ------------------------------------------------------------------------------------------------------------------------------------------------------------ 
*/


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.drone.application.gui.utils.DataSource;
import com.drone.application.gui.utils.MouseClick;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.event.GMapMouseEvent;
import com.lynden.gmapsfx.javascript.event.UIEventType;
import com.lynden.gmapsfx.javascript.object.DirectionsPane;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;
import com.lynden.gmapsfx.service.directions.DirectionStatus;
import com.lynden.gmapsfx.service.directions.DirectionsResult;
import com.lynden.gmapsfx.service.directions.DirectionsService;
import com.lynden.gmapsfx.service.directions.DirectionsServiceCallback;
import com.lynden.gmapsfx.util.MarkerImageFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainScreenController implements Initializable, MapComponentInitializedListener, DirectionsServiceCallback {
	
	final String RESOURCE_PATH = "resources/";
	final private String key = "AIzaSyD_hce37QhlyI59U2KDKiTEJMSlns47d6E";
	protected static DataSource droneparameters;
	protected static GoogleMap map;
	protected DirectionsService directionsService;
	protected DirectionsPane directionsPane;
	protected Marker DroneMarker;
	protected LatLong takeOff;
	
	@FXML
	protected GoogleMapView mapView;
	
	@FXML
	protected TabPane NouvaTab;
	
	@FXML
	protected AnchorPane ApriTab;
	
	@FXML
	protected TabPane ViewMissionTab;
	
	@FXML
	protected AnchorPane ViewTargetsTab;
	
	protected static int numberOfTargets = 0;
	protected static ArrayList<Marker> targetMarkers;
	
	protected static boolean showTargets;
	
	public DataSource getDroneparameters() {
		return MainScreenController.droneparameters;
	}

	public void setDroneparameters(DataSource droneparameters) {
		MainScreenController.droneparameters = droneparameters;
		System.out.println(MainScreenController.droneparameters.toString());
	}
	
	@FXML
	protected BorderPane MainScreen;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		System.out.println("loading default datasource");
		droneparameters = new DataSource();
		System.out.println("params loaded");

		if(mapView != null) {
			mapView.setKey(key);
			mapView.addMapInitializedListener(this);
			targetMarkers = new ArrayList<Marker>();
		}
	}
	
	
	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to Nuova Missione
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */
	
	@FXML
    private void loadNuovaMissione(ActionEvent event) {
		houseKeeping();
		if(!NouvaTab.isVisible())
			NouvaTab.setVisible(true);
		else
			NouvaTab.setVisible(false);
	}

	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to Apri Missione
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */

	@FXML
    private void loadApriMissione(ActionEvent event) {
		houseKeeping();
		System.out.println("loading Apri Missione ");
		if(!ApriTab.isVisible())
			ApriTab.setVisible(true);
		else
			ApriTab.setVisible(false);
	}

	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to View Missione
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */

	@FXML
    private void loadViewMissione(MouseEvent event) {
		System.out.println("loading View Missione ");
		houseKeeping();
		if(!ViewMissionTab.isVisible())
			ViewMissionTab.setVisible(true);
		else
			ViewMissionTab.setVisible(false);
	}

	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to View Target
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */

	@FXML
    private void loadViewTarget(MouseEvent event) {
		System.out.println("loading View Target ");
		houseKeeping();
		if(!ViewTargetsTab.isVisible())
			ViewTargetsTab.setVisible(true);
		else
			ViewTargetsTab.setVisible(false);
	}

	/*-------------------------------------------------------------------------
	 * Function to initialize google map
	 * Default center values are set as 41.121086, 14.181095
	 * ------------------------------------------------------------------------
	 */
	
	@Override
	public void mapInitialized() {
		System.out.println("init");
		 MapOptions mapOptions = new MapOptions();
		    mapOptions.center(new LatLong(41.121086, 14.181095))
		            .mapType(MapTypeIdEnum.ROADMAP)
		            .overviewMapControl(false)
		            .panControl(false)
		            .rotateControl(false)
		            .scaleControl(false)
		            .streetViewControl(false)
		            .zoomControl(false)
		            .zoom(12);

		    map = mapView.createMap(mapOptions);
		    takeOff = new LatLong(41.121086, 14.181095);
		    map.addMouseEventHandler(UIEventType.click, new MouseClick() {
		    	@Override
		        public void handle(GMapMouseEvent gmme) {
		            super.handle(gmme);
		            if(numberOfTargets >= 8) {
		            	System.out.println("Max targets reached!!");
		            	return;
		            }
		            numberOfTargets++;
		            Marker target = drawTargetMarker(gmme.getLatLong(), numberOfTargets);
		            targetMarkers.add(target);
		            map.addMarker(target);
		        }
		    });
		    
		    //Add a Drone marker to the map
		    String path = "file:src/com/drone/application/gui/resources/UIItems/drone.png";
		    DroneMarker = createCustomMarker(takeOff, path, "Take Off");
		    map.addMarker(DroneMarker);
		    
		    if(showTargets)
		    	updateMapTargets();
	}

	/*-------------------------------------------------------------------------
	 * Utility function to create custom markers
	 * @Param: LatLong position: The position of marker.
	 * @Param: String imagePath: The image path of the custom icon.
	 * @Param: String title: Any title you want for marker.
	 * ------------------------------------------------------------------------
	 */
	
	private Marker createCustomMarker(LatLong position, String imagePath, String title) {
		MarkerOptions markerOptions = new MarkerOptions();
		String imgpath = MarkerImageFactory.createMarkerImage(imagePath, "png");
		imgpath = imgpath.replace("(", "");
	    imgpath = imgpath.replace(")", "");
	    markerOptions.position(position)
        .visible(Boolean.TRUE)
        .title(title).icon(imgpath).label("D1");
	    Marker newMarker = new Marker( markerOptions);
		return newMarker;
	}

	/*-------------------------------------------------------------------------
	 * Utility function to create Target Marker
	 * @Param: GMapMouseEvent gmme: The mouseClick event.
	 * @Param: int number: The number of Target.
	 * ------------------------------------------------------------------------
	 */
	
	private Marker drawTargetMarker(LatLong pos, int number) {
		MarkerOptions markerOptions = new MarkerOptions();
		markerOptions.position(pos)
        .visible(Boolean.TRUE)
        .title("Target").label("T" + number);
	    Marker newMarker = new Marker(markerOptions);
	    return newMarker;
	}
	
	/*--------------------------------------------------------------------------
	 * Update the markers in the Map whenever called.
	 * Updates the map by fetching values from Datasource
	 * -------------------------------------------------------------------------
	 */
	
	protected void updateMapTargets() {
		//Removing markers if already present
		if(targetMarkers == null) {
			return;
		}
		
		if(!targetMarkers.isEmpty())
		map.removeMarkers(targetMarkers);

		ArrayList<String> targets = droneparameters.getTargetParams();
		numberOfTargets = 0;
		for(String s : targets) {
			numberOfTargets++;
			String[] posCord = s.split(", ");
			LatLong pos = new LatLong(Double.parseDouble(posCord[0]),Double.parseDouble(posCord[1]));
			if(numberOfTargets == 1) {
				continue;
			}
			System.out.println(s);
			Marker target = drawTargetMarker(pos, numberOfTargets - 1);
			targetMarkers.add(target);
			map.addMarker(target);
		}
	}

	@Override
	public void directionsReceived(DirectionsResult arg0, DirectionStatus arg1) {
		
	}
	
	@FXML
    private void handleHousekeeping(MouseEvent event) {
		houseKeeping();
	}
	
	private void houseKeeping() {
		if(NouvaTab != null)
			NouvaTab.setVisible(false);
		if(ApriTab != null)
			ApriTab.setVisible(false);
		if(ViewTargetsTab != null)
			ViewTargetsTab.setVisible(false);
		if(ViewMissionTab != null)
			ViewMissionTab.setVisible(false);
	}
}
