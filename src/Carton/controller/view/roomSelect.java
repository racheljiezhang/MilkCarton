package Carton.controller.view;

import Carton.controller.model.maps.room;
import javafx.stage.Stage;

public class roomSelect {
	private Stage currentStage;

	private boolean lvlOneMade = false;
	private boolean lvlTwoMade = false;
	private boolean lvlThreeMade = false;

	public void selectRoom(Stage stage) throws Exception {

		currentStage = stage;
		room lvlStage = new room();
		lvlStage.mapGeneration(currentStage);
	}

}
