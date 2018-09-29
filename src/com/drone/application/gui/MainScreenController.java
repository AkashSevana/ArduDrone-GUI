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
import java.util.ResourceBundle;

import com.drone.application.gui.utils.DataSource;
import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScreenController implements Initializable, MapComponentInitializedListener, DirectionsServiceCallback {
	
	final String RESOURCE_PATH = "resources/";
	
	protected static DataSource droneparameters;
	protected GoogleMap map;
	protected DirectionsService directionsService;
	protected DirectionsPane directionsPane;
	protected Marker DroneMarker;
	protected LatLong takeOff;
	@FXML
	protected GoogleMapView mapView;
	
	public DataSource getDroneparameters() {
		return MainScreenController.droneparameters;
	}


	public void setDroneparameters(DataSource droneparameters) {
		MainScreenController.droneparameters = droneparameters;
	}


	@FXML
	protected BorderPane MainScreen;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		System.out.println("loading default datasource");
		droneparameters = new DataSource();
		System.out.println("params loaded");
		//mapView.setKey("AIzaSyKwTCISuW2YXt-376JYLIxaX2_imQLuA20");
		mapView.addMapInitializedListener(this);
	}
	
	
	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to Nuova Missione
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */
	
	@FXML
    private void loadNuovaMissione(ActionEvent event) {
		System.out.println("loading NuovaMissione " + getClass().getResource(RESOURCE_PATH + "NouvaMission.fxml"));
		try {
			Parent root = FXMLLoader.load(getClass().getResource(RESOURCE_PATH + "NouvaMission.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource(RESOURCE_PATH + "application.css").toExternalForm());
			Stage window = (Stage)((Node)MainScreen).getScene().getWindow();
	        
	        window.setScene(scene);
	        window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to Apri Missione
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */

	@FXML
    private void loadApriMissione(ActionEvent event) {
		System.out.println("loading Apri Missione " + getClass().getResource(RESOURCE_PATH + "ApriMission.fxml"));
		try {
			Parent root = FXMLLoader.load(getClass().getResource(RESOURCE_PATH + "ApriMission.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource(RESOURCE_PATH + "application.css").toExternalForm());
			Stage window = (Stage)((Node)MainScreen).getScene().getWindow();
	        
	        window.setScene(scene);
	        window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to View Missione
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */

	@FXML
    private void loadViewMissione(MouseEvent event) {
		System.out.println("loading View Missione " + getClass().getResource(RESOURCE_PATH + "ViewMission.fxml"));
		try {
			Parent root = FXMLLoader.load(getClass().getResource(RESOURCE_PATH + "ViewMission.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource(RESOURCE_PATH + "application.css").toExternalForm());
			Stage window = (Stage)((Node)MainScreen).getScene().getWindow();
	        
	        window.setScene(scene);
	        window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate to View Target
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */

	@FXML
    private void loadViewTarget(MouseEvent event) {
		System.out.println("loading View Target " + getClass().getResource(RESOURCE_PATH + "ViewTargets.fxml"));
		try {
			Parent root = FXMLLoader.load(getClass().getResource(RESOURCE_PATH + "ViewTargets.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource(RESOURCE_PATH + "application.css").toExternalForm());
			Stage window = (Stage)((Node)MainScreen).getScene().getWindow();
	        
	        window.setScene(scene);
	        window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void mapInitialized() {
		
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
		    //Add a marker to the map
		    MarkerOptions markerOptions = new MarkerOptions();
		    takeOff = new LatLong(41.121086, 14.181095);
		    System.out.println("markers");
		    markerOptions.position(takeOff)
		                .visible(Boolean.TRUE)
		                .title("TakeOff");
		    DroneMarker = new Marker( markerOptions);
		    map.addMarker(DroneMarker);
	}


	@Override
	public void directionsReceived(DirectionsResult arg0, DirectionStatus arg1) {
		
	}
}
