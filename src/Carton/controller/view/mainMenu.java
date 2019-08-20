package Carton.controller.view;

import javafx.application.Platform;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.*;
import javafx.stage.*;

import java.io.IOException;
import java.util.Optional;

public class mainMenu  {
	

	@FXML
	public void handleExitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	public void handleExitOnKeyPressed(KeyEvent event) {
		System.exit(0);
	}

}
