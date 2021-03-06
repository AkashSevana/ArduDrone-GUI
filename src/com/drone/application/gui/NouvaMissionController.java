package com.drone.application.gui;

/**------------------------------------------------------------------------------------------------------------------------------------------------------------
* The NouvaMissionController class controls the functional aspects to
* displays Nouva Mission UI to the standard stage.
*
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29
* -------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NouvaMissionController extends ViewMissionController implements Initializable{

	final String RESOURCE_PATH = "resources/";
	@FXML
	private BorderPane NuovaScreen;
	
	// List containing Communication parameters
	@FXML
	private ArrayList<TextField> commList;
	
	// List containing Scenarios parameters
	@FXML
	private ArrayList<TextField> scenarioList;
	
	// List containing Algorithm parameters
	@FXML
	private ArrayList<TextField> algoList;
	
	
	// List containing latitude details
	@FXML
	private ArrayList<TextField> latList;
	
	// List containing longitude details
	@FXML
	private ArrayList<TextField> lonList;
	// List containing add Buttons
	@FXML
	private ArrayList<Button> addButtonList;
	// List containing panes
	@FXML
	private ArrayList<Pane> paneList;
	
	private int countPane = 0;
	
	// ArrayList of parameters parsed from Xls sheet
	protected ArrayList<Integer> CommunicationParams;
	protected ArrayList<Double> AlgorithmParams;
	protected ArrayList<Double> ScenarioParams;
	
	/*-------------------------------------------------------------------------
	 * Function which to initialize all tab values at once.
	 * ------------------------------------------------------------------------
	 */
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("hello Nuova");
		if(MainScreenController.droneparameters == null)
			super.initialize(location, resources);
		CommunicationParams = MainScreenController.droneparameters.getCommunicationParams();
		if(CommunicationParams == null)
			System.out.println("why null");
		Iterator<TextField> cl = commList.iterator();
		Iterator<Integer> cp = CommunicationParams.iterator();
		
		while (cl.hasNext() && cp.hasNext()) {
			TextField t = cl.next();
			Integer value = cp.next();
			t.setText(value.toString());
		}
		
		ScenarioParams = MainScreenController.droneparameters.getScenarioParams();
		Iterator<TextField> sl = scenarioList.iterator();
		Iterator<Double> sp = ScenarioParams.iterator();
		
		while (sl.hasNext() && sp.hasNext()) {
			TextField t = sl.next();
			Double value = sp.next();
			t.setText(value.toString());
		}
		
		AlgorithmParams = MainScreenController.droneparameters.getAlgorithmParams();
		Iterator<TextField> al = algoList.iterator();
		Iterator<Double> ap = AlgorithmParams.iterator();
		
		while (al.hasNext() && ap.hasNext()) {
			TextField t = al.next();
			Double value = ap.next();
			t.setText(value.toString());
		}
	}
	
	/*-------------------------------------------------------------------------
	 * Handlers for Reset and Load Buttons in Paremetri di comunicazione tab
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */
	
	@FXML
	private void handleresetComm(ActionEvent event) {
		for(TextField t : commList)
			t.setText("");
	}
	
	@FXML
	private void handleloadComm(ActionEvent event) {
		CommunicationParams = MainScreenController.droneparameters.getCommunicationParams();
		Iterator<TextField> cl = commList.iterator();
		Iterator<Integer> cp = CommunicationParams.iterator();
		
		while (cl.hasNext() && cp.hasNext()) {
			TextField t = cl.next();
			Integer value = cp.next();
			t.setText(value.toString());
		}
	}
	
	
	/*-------------------------------------------------------------------------
	 * Handlers for Reset and Load Buttons in Parametri di scenario tab
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */
	
	@FXML
	private void handleresetScenario(ActionEvent event) {
		for(TextField t : scenarioList)
			t.setText("");
	}
	
	@FXML
	private void handleloadScenario(ActionEvent event) {
		ScenarioParams = MainScreenController.droneparameters.getScenarioParams();
		Iterator<TextField> sl = scenarioList.iterator();
		Iterator<Double> sp = ScenarioParams.iterator();
		
		while (sl.hasNext() && sp.hasNext()) {
			TextField t = sl.next();
			Double value = sp.next();
			t.setText(value.toString());
		}
	}

	
	/*-------------------------------------------------------------------------
	 * Handlers for Reset and Load Buttons in Parametri di algoritmo tab
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */
	
	@FXML
	private void handleresetAlgo(ActionEvent event) {
		for(TextField t : algoList)
			t.setText("");
	}
	
	@FXML
	private void handleloadAlgo(ActionEvent event) {
		AlgorithmParams = MainScreenController.droneparameters.getAlgorithmParams();
		Iterator<TextField> al = algoList.iterator();
		Iterator<Double> ap = AlgorithmParams.iterator();
		
		while (al.hasNext() && ap.hasNext()) {
			TextField t = al.next();
			Double value = ap.next();
			t.setText(value.toString());
		}
	}
	
	
	/*-------------------------------------------------------------------------
	 * Handlers for ADD DELETE RESET LOAD Buttons in Target tab
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */
	
	
	@FXML
	private void handletargetButtonDel1(ActionEvent event) {
		checkAndPerformUIchange(2);
		countPane--;
		addButtonList.get(countPane).setVisible(true);
	}
	
	@FXML
	private void handletargetButtonDel2(ActionEvent event) {
		checkAndPerformUIchange(3);
		countPane--;
		addButtonList.get(countPane).setVisible(true);
	}
	
	@FXML
	private void handletargetButtonDel3(ActionEvent event) {
		checkAndPerformUIchange(4);
		countPane--;
		addButtonList.get(countPane).setVisible(true);
	}
	
	@FXML
	private void handletargetButtonDel4(ActionEvent event) {
		checkAndPerformUIchange(5);
		countPane--;
		addButtonList.get(countPane).setVisible(true);
	}
	
	@FXML
	private void handletargetButtonDel5(ActionEvent event) {
		checkAndPerformUIchange(6);
		countPane--;
		addButtonList.get(countPane).setVisible(true);
	}
	
	@FXML
	private void handletargetButtonDel6(ActionEvent event) {
		System.out.println("Del 6");
		checkAndPerformUIchange(7);
		countPane--;
		addButtonList.get(countPane).setVisible(true);
	}
	
	@FXML
	private void handletargetButtonDel7(ActionEvent event) {
		System.out.println("Del 7");
		paneList.get(7).setVisible(false);
		countPane--;
		addButtonList.get(countPane).setVisible(true);
	}
	
	@FXML
	private void handletargetButtonAdd1(ActionEvent event) {
		paneList.get(1).setVisible(true);
		((Button)event.getSource()).setVisible(false);
		addButtonList.get(1).setVisible(true);
		countPane++;
	}
	
	@FXML
	private void handletargetButtonAdd2(ActionEvent event) {
		paneList.get(2).setVisible(true);
		((Button)event.getSource()).setVisible(false);
		addButtonList.get(2).setVisible(true);
		countPane++;
	}
	
	@FXML
	private void handletargetButtonAdd3(ActionEvent event) {
		paneList.get(3).setVisible(true);
		((Button)event.getSource()).setVisible(false);
		addButtonList.get(3).setVisible(true);
		countPane++;
	}
	
	@FXML
	private void handletargetButtonAdd4(ActionEvent event) {
		paneList.get(4).setVisible(true);
		((Button)event.getSource()).setVisible(false);
		addButtonList.get(4).setVisible(true);
		countPane++;
	}
	
	@FXML
	private void handletargetButtonAdd5(ActionEvent event) {
		paneList.get(5).setVisible(true);
		((Button)event.getSource()).setVisible(false);
		addButtonList.get(5).setVisible(true);
		countPane++;
	}
	
	@FXML
	private void handletargetButtonAdd6(ActionEvent event) {
		paneList.get(6).setVisible(true);
		((Button)event.getSource()).setVisible(false);
		addButtonList.get(6).setVisible(true);
		countPane++;
	}
	
	@FXML
	private void handletargetButtonAdd7(ActionEvent event) {
		paneList.get(7).setVisible(true);
		((Button)event.getSource()).setVisible(false);
		countPane++;
	}
	
	@FXML
	private void handleresetTarget(ActionEvent event) {
		for(TextField t : latList) {
			t.setText("");
		}
		for(TextField t : lonList) {
			t.setText("");
		}
	}
	
	@FXML
	private void handleloadTarget(ActionEvent event) {
		ArrayList<String> targetsParams;

		targetsParams = MainScreenController.droneparameters.getTargetParams();
		Iterator<TextField> ll = latList.iterator();
		Iterator<TextField> llon = lonList.iterator();
		Iterator<String> tp = targetsParams.iterator();

		while(ll.hasNext() && tp.hasNext() && llon.hasNext()) {
			String[] position = tp.next().split(", ");
			ll.next().setText(position[0]);
			llon.next().setText(position[1]);
		}
		
		showTargets = true;
	}
	
	
	private void checkAndPerformUIchange(int value) {
		int i = value;
		for(i = value; i <= countPane; ++i) {
			
			latList.get(i).setText(latList.get(i+1).getText());
			lonList.get(i).setText(lonList.get(i+1).getText());
		}
		System.out.println(countPane);
		paneList.get(countPane).setVisible(false);
		if(countPane < 7)
			addButtonList.get(countPane).setVisible(false);
	}
}
