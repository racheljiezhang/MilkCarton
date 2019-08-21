//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//import javax.swing.ImageIcon;
//
//import Carton.controller.model.maps.room;
//
//
//class mcListener implements KeyListener{
//	private Node self;
//	private room room;
//	public mcListener(room room) {
//		this.self = room.getMc();
//		this.room = room;
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println(e.getKeyCode());
//		switch(e.getKeyCode()) {
//		
//		case 38:
//			self.moveUp;
//			break;
//			
//		case 37:
//			self.moveLeft();
//			ImageIcon icon = new ImageIcon("IMG/" + Main.setting + "SpiderLeft.png");
//			//self.IMG = self.Left;
//			self.changeImageIcon(icon);
//			break;
//			
//		case 39:
//			self.moveRight();
//			ImageIcon icon2 = new ImageIcon("IMG/" + Main.setting + "SpiderRight.png");
//			//self.IMG = self.Right;
//			self.changeImageIcon(icon2);
//			break;
//		case 40:
//			if(self.getCenterPoint().getY() < Level.HEIGHT - 122) {
//				self.moveBy(0, 82);
//			}
//			break;
//			
//		case 32:
//			self.shootWeb();
//			break;
//			
//		case 85:
//			level.nextLevel();
//			break;
//		
//		case 68:
//			level.prevLevel();
//			break;
//		}
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//	}
//	
//}
