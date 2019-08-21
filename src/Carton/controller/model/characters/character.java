 package Carton.controller.model.characters;

public class character {
	/*
	 * This class contains aspects of a character
	 */

	// Character Name
	String characterName;

	// Character model
	private String modelLocation;
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

	// Constructor
	public character() {
		this.setUp("images/redUp.png");
		this.setDown("images/redUp.png");
		this.setLeft("images/redUp.png");
		this.setRight("images/redUp.png");
		
		this.setHeart(1);
		this.setLungs(1);
		this.setKidney(1);
		this.setLiver(1);
		this.setBrain(1);
		
		this.setStomach(1);
		this.setEye(2);
		this.setTongue(1);
		this.setEar(1);
		this.setReprod(1);
		this.setSpleen(1);
		this.setGallbladder(1);
		this.setPancreas(1);
		
		this.setTonsils(1);
		this.setAppendix(1);
		this.setNails(1);
		this.setToe(1);
		this.setThyroid(1);
	}

	// Name
	public void setName(String name) {
		characterName = name;
	}
	public String getName() {
		return characterName;
	}

	public int getTotalPoints() {
		int vitals = (this.getHeart() + this.brain + this.liver + this.getLungs() + this.kidney) * 5;
		int normals = (this.stomach + this.eye + this.tongue + this.ear + this.reprod 
				+ this.spleen + this.gallbladder + this.pancreas) * 2;
		int safetys = (this.tonsils + this.appendix + this.nails + this.toe + this.thyroid);
		return vitals + normals + safetys;
	}

	public String getModelDirection(String direction) {
		if (direction.equals("RIGHT")) {
			modelLocation = right;
		} else if (direction.equals("LEFT")) {
			modelLocation = left;
		} else if (direction.equals("UP")) {
			modelLocation = up;
		} else if (direction.equals("DOWN")) {
			modelLocation = down;
		}
		return modelLocation;
	}

	
	// Setters and Getters
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
