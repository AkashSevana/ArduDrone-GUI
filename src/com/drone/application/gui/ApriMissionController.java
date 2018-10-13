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
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.drone.application.gui.utils.DataSource;
import com.lynden.gmapsfx.javascript.object.Marker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class ApriMissionController extends MainScreenController implements Initializable {

	final String RESOURCE_PATH = "resources/";
	
	@FXML
	private TextField ApriPath;
	@FXML
	private TextArea ApriText;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(MainScreenController.droneparameters == null)
			super.initialize(location, resources);
	}
	
	@FXML
	private void handleApriLoad(ActionEvent event) {
		System.out.println("Loading the values");
		if(targetMarkers == null)
		targetMarkers = new ArrayList<Marker>();
		updateMapTargets();
	}
	
	@FXML
	private void handleBrowse(ActionEvent event) {
		System.out.println("browse");
		FileChooser openFileChooser = new FileChooser();
        File xlsFile = openFileChooser.showOpenDialog(null);
        
        String path = xlsFile.getAbsolutePath();
        ApriPath.setText(path);
        DataSource newObj = new DataSource(path);
        setDroneparameters(newObj);
        ApriText.setText(MainScreenController.droneparameters.toString());
	}
}
