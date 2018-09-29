package com.drone.application.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

/**------------------------------------------------------------------------------------------------------------------------------------------------------------
* The ViewMissionController class controls the functional aspects to
* displays View Mission UI to the standard stage.
*
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29
* -------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ViewMissionController extends MainScreenController implements Initializable {

	final String RESOURCE_PATH = "resources/";
	
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
	
}
