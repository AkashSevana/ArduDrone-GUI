package com.drone.application.gui;

/**
* The ApriMissionController class controls the functional aspects to
* displays Apri Mission UI to the standard stage.
*
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29 
*/

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApriMissionController implements Initializable{

	final String RESOURCE_PATH = "resources/";
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
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
	
	@FXML
	private void handleApriLoad(ActionEvent event) {
		
	}
	
	@FXML
	private void handleBrowse(ActionEvent event) {
		
	}
}
