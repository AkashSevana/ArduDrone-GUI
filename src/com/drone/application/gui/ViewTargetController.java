package com.drone.application.gui;

/**------------------------------------------------------------------------------------------------------------------------------------------------------------
* The ViewTargetController class controls the functional aspects to
* displays View Target UI to the standard stage.
*
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29
* ------------------------------------------------------------------------------------------------------------------------------------------------------------
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
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ViewTargetController extends MainScreenController implements Initializable{

	final String RESOURCE_PATH = "resources/";
	
	// List of labels to display the targets
	@FXML
	private ArrayList<Label> labelList;
	ArrayList<String> targetsParams;
	
	/*-------------------------------------------------------------------------
	 * Function which to initialize target values.
	 * ------------------------------------------------------------------------
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("hello Target");
		if(MainScreenController.droneparameters == null)
			super.initialize(location, resources);
		targetsParams = MainScreenController.droneparameters.getTargetParams();
		Iterator<Label> ll = labelList.iterator();
		Iterator<String> tp = targetsParams.iterator();
		
		while(ll.hasNext() && tp.hasNext()) {
			String[] position = tp.next().split(", ");
			ll.next().setText(position[0]);
			ll.next().setText(position[1]);
		}
	}
}
