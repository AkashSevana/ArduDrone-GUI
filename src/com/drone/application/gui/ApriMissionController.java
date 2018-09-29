package com.drone.application.gui;

import java.io.File;

/**------------------------------------------------------------------------------------------------------------------------------------------------------------
* The ApriMissionController class controls the functional aspects to
* displays Apri Mission UI to the standard stage.
*
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29
* ------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

import java.net.URL;
import java.util.ResourceBundle;

import com.drone.application.gui.utils.DataSource;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ApriMissionController extends MainScreenController implements Initializable {

	final String RESOURCE_PATH = "resources/";
	
	@FXML
	private TextField ApriPath;
	@FXML
	private TextArea ApriText;
	
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
		System.out.println("Loading the values");
	}
	
	@FXML
	private void handleBrowse(ActionEvent event) {
		System.out.println("browse");
		FileChooser openFileChooser = new FileChooser();
        File xlsFile = openFileChooser.showOpenDialog(null);
        
        String path = xlsFile.getAbsolutePath();
        ApriPath.setText(path);
        DataSource newObj = new DataSource(path);
        droneparameters = newObj;
        ApriText.setText(droneparameters.toString());
	}
}
