package gameState;

import java.awt.Graphics;
import java.util.Stack;

public class StateManager {
	public static Stack<State> st;

	public StateManager() {
		st = new Stack<State>();
		menu();
	}

	public static void menu() {
		st.push(new MenuBackground(null));
	}

	public void perSecond() {
		st.peek().perSecond();
	}

	public void draw(Graphics g) {
		st.peek().draw(g);
	}

	public void keyPressed(int y) {
		st.peek().keyPressed(y);
	}

	public void keyReleased(int y) {
		st.peek().keyReleased(y);
	}
}
