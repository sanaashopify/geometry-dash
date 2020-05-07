package gameState;

import java.awt.Graphics;

public abstract class State {	
	public StateManager gm;
	public static double xOff;
	public static double yOff;
	
	public State(StateManager gm){
		this.gm = gm;
		xOff =0;
		yOff =0;
		init();
		
	}
	public abstract void init();
	public abstract void perSecond();
	public abstract void draw(Graphics g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
}