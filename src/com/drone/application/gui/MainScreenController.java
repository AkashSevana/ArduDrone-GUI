package com.drone.application.gui;

/**
* The MainScreenController class controls the functional aspects to
* displays MainScreen UI to the standard stage.
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainScreenController implements Initializable {
	
	final String RESOURCE_PATH = "resources/";
	
	@FXML
	BorderPane MainScreen;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
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
}
