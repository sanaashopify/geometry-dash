package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import image.Images;
import main.Gamepanel;

public class WinS extends State{
	public String[] ar = {"Main Menu", "Quit" };
	public int select = 0;
	public WinS(StateManager gm) {
		super(gm);
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void perSecond() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Images.background[4], 0, 0, Gamepanel.width, Gamepanel.height, null);
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(128, 231, 44));
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 55));
			g.drawString(ar[i], 225 + i * 400, Gamepanel.height / 2+125);

		}
	}

	@Override
	public void keyPressed(int k) {
		if (k == KeyEvent.VK_RIGHT) {
			select++;
			if (select >= ar.length) {
				select = 0;
			}
		} else if (k == KeyEvent.VK_LEFT) {
			select--;
			if (select < 0) {
				select = ar.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) {
			if (select == 0) {
				StateManager.st.push(new Menu(gm));
			}

			if (select == 1) {
				System.exit(0);
			}

			
		}

	}

	@Override
	public void keyReleased(int k) {

	}

}
