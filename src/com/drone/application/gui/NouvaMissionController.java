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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NouvaMissionController extends MainScreenController implements Initializable{

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
	
	protected ArrayList<Integer> CommunicationParams;
	protected ArrayList<Double> AlgorithmParams;
	protected ArrayList<Double> ScenarioParams;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(MainScreenController.droneparameters == null)
			System.out.println("why null");
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
		
		ScenarioParams = droneparameters.getScenarioParams();
		Iterator<TextField> sl = scenarioList.iterator();
		Iterator<Double> sp = ScenarioParams.iterator();
		
		while (sl.hasNext() && sp.hasNext()) {
			TextField t = sl.next();
			Double value = sp.next();
			t.setText(value.toString());
		}
		
		AlgorithmParams = droneparameters.getAlgorithmParams();
		Iterator<TextField> al = algoList.iterator();
		Iterator<Double> ap = AlgorithmParams.iterator();
		
		while (al.hasNext() && ap.hasNext()) {
			TextField t = al.next();
			Double value = ap.next();
			t.setText(value.toString());
		}
	}
	
	/*-------------------------------------------------------------------------
	 * Function which is used to Navigate back to Main Screen
	 * @Param: ActionEvent
	 * ------------------------------------------------------------------------
	 */
	
	@FXML
    private void loadMainScreen(ActionEvent event) {
		System.out.println("loading MainScreen " + getClass().getResource(RESOURCE_PATH + "MainScreen.fxml"));
		try {
			Parent root = FXMLLoader.load(getClass().getResource(RESOURCE_PATH + "MainScreen.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource(RESOURCE_PATH + "application.css").toExternalForm());
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	        
	        window.setScene(scene);
	        window.show();
		} catch(Exception e) {
			e.printStackTrace();
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
		CommunicationParams = droneparameters.getCommunicationParams();
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
		ScenarioParams = droneparameters.getScenarioParams();
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
		AlgorithmParams = droneparameters.getAlgorithmParams();
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
		
	}
	
	@FXML
	private void handletargetButtonDel2(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonDel3(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonDel4(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonDel5(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonDel6(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonDel7(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonAdd1(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonAdd2(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonAdd3(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonAdd4(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonAdd5(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonAdd6(ActionEvent event) {
		
	}
	
	@FXML
	private void handletargetButtonAdd7(ActionEvent event) {
		
	}
	
	@FXML
	private void handleresetTarget(ActionEvent event) {
		
	}
	
	@FXML
	private void handleloadTarget(ActionEvent event) {
		
	}
	
}
