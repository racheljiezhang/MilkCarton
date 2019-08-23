package Carton.controller.model.characters;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class mc extends character{
	private Node mcNode;
	
	public mc() {
		this.setUp("images/redUp.png");
		this.setDown("images/redDown.png");
		this.setLeft("images/redLeft.png");
		this.setRight("images/redRight.png");
		this.setImage(this.getUp());
		this.setEar(10);

	}

}
