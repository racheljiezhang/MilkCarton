package Carton.controller.view;

import Carton.controller.model.maps.room;
import javafx.stage.Stage;

public class roomSelect {
	private Stage currentStage;

	public void selectRoom(Stage stage) throws Exception {

		currentStage = stage;
		room roomba = new room();
		roomba.mapGeneration(currentStage);
	}

}
