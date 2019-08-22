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
		this.mcNode = createMc();
	}
	
	// Create knight user
	public Node createMc() {
		Image nein = new Image(this.getImage());
		ImageView knightView = new ImageView(nein);
		knightView.setFitHeight(40);
		knightView.setFitWidth(40);

		knightView.getProperties().put("alive", true);

		return knightView;
	}

	public Node getMcNode() {
		return mcNode;
	}

	public void setMcNode(Node mcNode) {
		this.mcNode = mcNode;
	}
	

}
