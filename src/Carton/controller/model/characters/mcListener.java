package Carton.controller.model.characters;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import Carton.controller.model.maps.*;
import javafx.scene.Node;


public class mcListener implements KeyListener{
	private mc self;
	private room room;
	
	public mcListener(room room) {
		this.room = room;
		this.self = room.getmChar();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		switch(e.getKeyCode()) {
		
		case 97:
			self.moveUp();
			break;
			
		case 65:
			self.moveLeft();
			break;
			
		case 68:
			self.moveRight();
			break;
			
		case 83:
			self.moveDown();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
}
