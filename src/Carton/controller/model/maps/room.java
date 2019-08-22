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
import javafx.animation.AnimationTimer;
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
	private static int tile = 40;
	private int length;
	private int width;
	private String file = "src/roomFiles/testerhall.txt";

	private ArrayList<Node> platforms = new ArrayList<Node>();

	private Pane appRoot = new Pane();
	private Pane gameRoot = new Pane();
	private Pane uiRoot = new Pane();
	private Pane userRoot = new Pane();
	private Pane popupRoot = new Pane();

	private double userX = 360;
	private double userY = 360;

	private Stage stage;
	
	mc mChar = new mc();
	Node mcNode = mChar.getMcNode();
	
	public room() {
		KeyListener k = new mcListener(this);
		this.addKeyListener(k);
	}

	public void mapGeneration(Stage map) throws Exception {

		makeRoom();
		this.stage = map;
		this.stage.setHeight(map.getHeight());
		this.stage.setWidth(map.getWidth());
		this.stage.setResizable(false);

		Scene scene = new Scene(appRoot);
		System.out.println(map);
		map.setScene(scene);
		map.show();

	}

	public void makeRoom() throws FileNotFoundException {

		Image bg = new Image("images/white.jpg");
		ImageView bgView = new ImageView(bg);

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
					Node wall = createImage( 40, 40, x, y,"images/black.png");
					break;
				}
				x = x + 40;
			}
			y = y + 40;
		}
		
		mcNode.setLayoutX(userX);
		mcNode.setLayoutY(userY);
		
		appRoot.getChildren().addAll(bgView, gameRoot, mcNode);
	}

	// Creates uncrossables

	private Node createImage(int h, int w, double x, double y, String link) {

		Image img = new Image(link);
		ImageView imageView = new ImageView(img);
		imageView.setFitHeight(h);
		imageView.setFitWidth(w);
		imageView.setX(x);
		imageView.setY(y);
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
