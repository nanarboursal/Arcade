package console;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import pong.PongGame;
import snake.SnakeGame;
import tetris.TetrisGame;


public class Console extends JFrame {

	// JFrame
	static JFrame main;

	// JButton
	static JButton game1, game2, game3;

	// label to display text
	static JLabel label;

	public static void main(String args[]) {

		// JFrame creation
		main = new JFrame("OOP Games :O");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(400, 600);

		// Adding label
		label = new JLabel("Welcome!");

		// Jbutton creation and Action Listeners
		JButton game1 = new JButton("Tetris");
		JButton game2 = new JButton("Ping Pong");
		JButton game3 = new JButton("Snake Game");

		game1.setSize(200, 200);

		// Tetris Game
		game1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				TetrisGame tg = new TetrisGame();
				tg.playTetris();
			}
		});

		// Ping Pong Game
		game2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				PongGame pg = new PongGame();
				pg.playPong();
			}
		});

		// Snake Game
		game3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SnakeGame sg = new SnakeGame();
				sg.playSnake();
			}
		});

		game1.setSize(500, 500);
		game1.setVisible(true);

		game2.setSize(500, 500);
		game2.setVisible(true);

		main.add(new MenuPanel(game1, game2, game3));
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}

}
