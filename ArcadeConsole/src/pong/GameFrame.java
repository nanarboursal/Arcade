package pong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	GamePanel panel; //canvas we are painting, frame houses the painting
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Ping Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();// once game panel is created the game frame class will fit around the panel
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}

}
