package main;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;
import static main.Game.GAME_HEIGHT;
import static main.Game.GAME_WIDTH;

import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;

public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private Game game;
	
	public GamePanel(Game game){
		mouseInputs = new MouseInputs(this);
		this.game = game;
		
		setPanelSize();
		
		addKeyListener(new KeyboardInputs(this)); 
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
		}

	private void setPanelSize() {
		Dimension size = new Dimension(GAME_WIDTH, GAME_HEIGHT);
		setPreferredSize(size);
		System.out.println("Size: " + GAME_WIDTH + " : " + GAME_HEIGHT);
		
	}
	 
    public void updateGame() {	
		
    }	
			
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		game.render(g);
		
	}
	
	public Game getGame() {
	return game;
	
	}
	
}
	
	

	
