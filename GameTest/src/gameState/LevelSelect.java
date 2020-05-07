package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.KeyEvent;

import image.Images;
import main.Gamepanel;

public class LevelSelect extends State {
	public String[] ar = { "Level One", "Level Two" };
	public int select = 0;

	public LevelSelect(StateManager gm) {
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
		g.drawImage(Images.background[2], 0, 0, Gamepanel.width, Gamepanel.height, null);
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(128, 231, 44));
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 80));
			g.drawString(ar[i], Gamepanel.width / 2 - 155, 185 + i * 155);

		}

	}

	public void keyPressed(int k) {
		if (k == KeyEvent.VK_DOWN) {
			select++;
			if (select >= ar.length) {
				select = 0;
			}
		} else if (k == KeyEvent.VK_UP) {
			select--;
			if (select < 0) {
				select = ar.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) {
			if (select == 0) {
				StateManager.st.push(new Level1State(gm));
			}

			if (select == 1) {
				StateManager.st.push(new Level2State(gm));
			}
		}

	}

	@Override
	public void keyReleased(int k) {

	}

}