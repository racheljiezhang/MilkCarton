 package Carton.controller.model.characters;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class character {
	/*
	 * This class contains aspects of a character
	 */

	// Character Name
	String characterName;

	// Character model
	private String image;
	private String up;
	private String down;
	private String left;
	private String right;
	
	// Vital Organ tokens
	private int heart;
	private int lungs;
	private int kidney;
	private int liver;
	private int brain;
	
	// Normal Organ tokens
	private int stomach;
	private int eye;
	private int tongue;
	private int ear;
	private int reprod;
	private int spleen;
	private int gallbladder;
	private int pancreas;
	
	// Safety Organ tokens
	private int tonsils;
	private int appendix;
	private int nails;
	private int toe;
	private int thyroid;

	private Node mcNode;

	// Constructor
	public character() {

		this.up ="images/redUp.png";
		this.down = "images/redUp.png";
		this.left = "images/redUp.png";
		this.right = "images/redUp.png";
		this.image = this.up;
		
		this.heart = 1;
		this.lungs = 1;
		this.kidney = 1;
		this.liver = 1;
		this.brain = 1;
		
		this.stomach = 1;
		this.eye = 2;
		this.tongue = 1;
		this.ear = 2;
		this.reprod = 1;
		this.spleen = 1;
		this.gallbladder = 1;
		this.pancreas = 1;
		
		this.tonsils = 1;
		this.appendix = 1;
		this.nails = 1;
		this.toe = 1;
		this.thyroid = 1;
		
		this.mcNode = createMc();
	}

	// Name
	public void setName(String name) {
		characterName = name;
	}
	public String getName() {
		return characterName;
	}

	// Get points
	public int getTotalPoints() {
		int vitals = (this.getHeart() + this.brain + this.liver + this.getLungs() + this.kidney) * 5;
		int normals = (this.stomach + this.eye + this.tongue + this.ear + this.reprod 
				+ this.spleen + this.gallbladder + this.pancreas) * 2;
		int safetys = (this.tonsils + this.appendix + this.nails + this.toe + this.thyroid);
		return vitals + normals + safetys;
	}
	
	// Create node
	public Node createMc() {
		Image nein = new Image(this.getImage());
		ImageView knightView = new ImageView(nein);
		knightView.setFitHeight(40);
		knightView.setFitWidth(40);

		knightView.getProperties().put("alive", true);

		return knightView;
	}
	
	public void moveUp() {
		this.setImage(this.getUp());
		this.getMcNode().setLayoutY(getMcNode().getLayoutY() - 10);
	}
	
	public void moveDown() {
		this.setImage(this.getDown());
		this.getMcNode().setLayoutY(getMcNode().getLayoutY() + 10);
	}
	
	public void moveLeft() {
		this.setImage(this.getLeft());
		this.getMcNode().setLayoutX(getMcNode().getLayoutX() - 10);
	}
	
	public void moveRight() {
		this.setImage(this.getRight());
		this.getMcNode().setLayoutX(getMcNode().getLayoutX() + 10);
	}
	
	// Setters and Getters

	public Node getMcNode() {
		return mcNode;
	}

	public void setMcNode(Node mcNode) {
		this.mcNode = mcNode;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUp() {
		return up;
	}

	public void setUp(String up) {
		this.up = up;
	}

	public String getDown() {
		return down;
	}

	public void setDown(String down) {
		this.down = down;
	}

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

	public int getHeart() {
		return this.heart;
	}

	public void setHeart(int heart) {
		this.heart = heart;
	}

	public int getLungs() {
		return lungs;
	}

	public void setLungs(int lungs) {
		this.lungs = lungs;
	}
	
	public int getKidney() {
		return kidney;
	}

	public void setKidney(int kidney) {
		this.kidney = kidney;
	}

	public int getLiver() {
		return liver;
	}

	public void setLiver(int liver) {
		this.liver = liver;
	}

	public int getBrain() {
		return brain;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public int getStomach() {
		return stomach;
	}

	public void setStomach(int stomach) {
		this.stomach = stomach;
	}

	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public int getTongue() {
		return tongue;
	}

	public void setTongue(int tongue) {
		this.tongue = tongue;
	}

	public int getEar() {
		return ear;
	}

	public void setEar(int ear) {
		this.ear = ear;
	}

	public int getReprod() {
		return reprod;
	}

	public void setReprod(int reprod) {
		this.reprod = reprod;
	}

	public int getSpleen() {
		return spleen;
	}

	public void setSpleen(int spleen) {
		this.spleen = spleen;
	}

	public int getGallbladder() {
		return gallbladder;
	}

	public void setGallbladder(int gallbladder) {
		this.gallbladder = gallbladder;
	}

	public int getPancreas() {
		return pancreas;
	}

	public void setPancreas(int pancreas) {
		this.pancreas = pancreas;
	}

	public int getTonsils() {
		return tonsils;
	}

	public void setTonsils(int tonsils) {
		this.tonsils = tonsils;
	}

	public int getAppendix() {
		return appendix;
	}

	public void setAppendix(int appendix) {
		this.appendix = appendix;
	}

	public int getNails() {
		return nails;
	}

	public void setNails(int nails) {
		this.nails = nails;
	}

	public int getToe() {
		return toe;
	}

	public void setToe(int toe) {
		this.toe = toe;
	}

	public int getThyroid() {
		return thyroid;
	}

	public void setThyroid(int thyroid) {
		this.thyroid = thyroid;
	}
}
