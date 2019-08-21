package Carton.controller.model.characters;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class mc extends character{
	private Node mcNode = createMc();
	
	public mc() {
		this.setUp("images/redUp.png");
		this.setDown("images/redDown.png");
		this.setLeft("images/redLeft.png");
		this.setRight("images/redRight.png");
		this.setEar(10);
	}
	
	// Create knight user
	private Node createMc() {
		System.out.println(this.getRight());
		System.out.println(this.getEar());
		Image nein = new Image("images/redUp.png");
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
