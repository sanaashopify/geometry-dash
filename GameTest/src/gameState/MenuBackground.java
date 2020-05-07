package gameState;

import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import image.Images;
import main.Gamepanel;

public class MenuBackground extends State implements ActionListener{

	public MenuBackground(StateManager gm) {
		super(gm);
		
	}

	@Override
	public void init() {

	}

	@Override
	public void perSecond() {

	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Images.background[1],0, 0, Gamepanel.width, Gamepanel.height,null);
	}

	public void keyPressed(int k) {
		if (k == KeyEvent.VK_ENTER){
			StateManager.st.push(new Menu(gm));
		}

	}
	public void actionPerformed (ActionEvent event) {
		
	}

	@Override
	public void keyReleased(int k) {

	}

}