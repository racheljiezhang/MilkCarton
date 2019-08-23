package Carton.controller.model.maps;

import java.awt.event.*;  
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import Carton.controller.model.characters.*;
import javafx.scene.input.KeyEvent;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class room {
	private String file = "src/roomFiles/tester2";
	
	private ArrayList<Node> allobjects = new ArrayList<>();

	private Pane appRoot = new Pane();
	private Pane gameRoot = new Pane();

	
	private boolean goUp = false, goDown = false, goLeft = false, goRight = false;

	private Stage stage;

	private double userX = 500;
	private double userY = 325;
	
	mc mChar = new mc();
	Node mcNode = mChar.getMcNode();

	public void mapGeneration(Stage map) throws Exception {

		makeRoom();
		this.stage = map;
		this.stage.setHeight(map.getHeight());
		this.stage.setWidth(map.getWidth());
		this.stage.setResizable(false);

		Scene scene = new Scene(appRoot);
		  scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
	            @Override
	            public void handle(KeyEvent event) {
	        		switch(event.getCode()) {

	        		case W:
	        			goUp = true;
	        			break;
	        			
	        		case A:
	        			goLeft = true;
	        			break;
	        			
	        		case D:
	        			goRight = true;
	        			break;
	        			
	        		case S:
	        			goDown = true;
	        			break;
	        		}
	            }
	        });
		  
		  scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
	            @Override
	            public void handle(KeyEvent event) {
	        		switch(event.getCode()) {
	        		
	        		case W:
	        			goUp = false;
	        			break;
	        			
	        		case A:
	        			goLeft = false;
	        			break;
	        			
	        		case D:
	        			goRight = false;
	        			break;
	        			
	        		case S:
	        			goDown = false;
	        			break;
	        		}
	            }
	        });
		
		System.out.println(map);
		map.setScene(scene);
		map.show();
		
		AnimationTimer timer = new AnimationTimer() {

			@Override
			public void handle(long arg0) {
                int dx = 0, dy = 0;

                if (goUp) dy += 3;
                if (goDown) dy -= 3;
                if (goRight)  dx -= 3;
                if (goLeft)  dx += 3;

                moveHeroBy(dx, dy);
			}
        };
        timer.start();

	}

	public void makeRoom() throws FileNotFoundException {

		Scanner sc;
		FileReader file = new FileReader(this.file);
		sc = new Scanner(file);
		int y = 0;

		while(sc.hasNextLine()) {
			String row = sc.nextLine().trim();
			int x = 0;
			for(char ch : row.toCharArray()) {
				switch(ch) {
				case '.':
					break;
				case 'w':
					Node wall = createImage(40, 40, "images/black.png");
					wall.setLayoutX(x);
					wall.setLayoutY(y);
					allobjects.add(wall);
					break;
				}
				x = x + 40;
			}
			y = y + 40;
		}
		
		mcNode.setLayoutX(userX);
		mcNode.setLayoutY(userY);
		
		appRoot.getChildren().addAll(gameRoot, mcNode);
	}
	
    private void moveHeroBy(int dx, int dy) {
    	boolean canUp = true, canDown = true, canLeft = true, canRight = true;
    	for(Node n : allobjects) {
	        if(mcNode.getLayoutX() <= n.getLayoutX()+40 && mcNode.getLayoutX() >= n.getLayoutX()
	        		&& mcNode.getLayoutY()+40 <= n.getLayoutY()+3 && mcNode.getLayoutY()+40 >= n.getLayoutY()-3){
	        	canDown = false;}
	        if(mcNode.getLayoutX() <= n.getLayoutX()+40 && mcNode.getLayoutX() >= n.getLayoutX()
	        		&& mcNode.getLayoutY()-3 <= n.getLayoutY()+40 && mcNode.getLayoutY()+3 >= n.getLayoutY()+40){
	        	canUp = false;}
	        if(mcNode.getLayoutY() <= n.getLayoutY()+40 && mcNode.getLayoutY() >= n.getLayoutY()
	        		&& mcNode.getLayoutX()+40 <= n.getLayoutX()+3 && mcNode.getLayoutX()+40 >= n.getLayoutX()-3){
	        	canRight = false;}
	        if(mcNode.getLayoutY() <= n.getLayoutY()+40 && mcNode.getLayoutY() >= n.getLayoutY()
	        		&& mcNode.getLayoutX()-3 <= n.getLayoutX()+40 && mcNode.getLayoutX()+3 >= n.getLayoutX()+40){
	        	canLeft = false;}
    	}
    	
    	if(!canDown && dy < 0) {
    		for(Node n : allobjects) {
    			n.relocate(n.getLayoutX(), n.getLayoutY()-dy);}}
    	
    	if(!canUp && dy > 0) {
    		for(Node n : allobjects) {
    			n.relocate(n.getLayoutX(), n.getLayoutY()-dy);}}
    	
    	if(!canLeft && dx > 0) {
    		for(Node n : allobjects) {
    			n.relocate(n.getLayoutX()-dx, n.getLayoutY());}}
    	
    	if(!canRight && dx < 0) {
    		for(Node n : allobjects) {
    			n.relocate(n.getLayoutX()-dx, n.getLayoutY());}}

        for(Node n : allobjects) {
	        double x = 20 + n.getLayoutX() + dx;
	        double y = 20 + n.getLayoutY() + dy;

	        moveHeroTo(x, y, n);
        }
    }

    private void moveHeroTo(double x, double y, Node n) {

            n.relocate(x - 20, y - 20);

    }

	// Creates uncrossables

	private Node createImage(int h, int w, String link) { 

		Image img = new Image(link);
		ImageView imageView = new ImageView(img);
		imageView.setFitHeight(h);
		imageView.setFitWidth(w);
		imageView.getProperties().put("alive", true);

		gameRoot.getChildren().add(imageView);
		return imageView;
	}
	
	// Setters and Getters

	public mc getmChar() {
		return mChar;
	}

	public void setmChar(mc mChar) {
		this.mChar = mChar;
	}

}
