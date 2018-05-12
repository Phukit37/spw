package f2.spw;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		JPanel mutiplayer = new JPanel();
		GridLayout layout = new GridLayout(1,2);

		frame.setSize(900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		layout.setHgap(1);							
		layout.setVgap(1);	
		mutiplayer.setLayout(layout);

		SpaceShip ship1 = new SpaceShip(150, 550, 20, 20);
		GamePanel monitor1 = new GamePanel();
		GameEngine engine1 = new GameEngine(monitor1, ship1);
		SpaceShip ship2 = new SpaceShip(150, 550, 20, 20);
		GamePanel monitor2 = new GamePanel();
		GameEngine2 engine2 = new GameEngine2(monitor2, ship2);

		mutiplayer.add(monitor1);
		mutiplayer.add(monitor2);
		frame.addKeyListener(engine1);
		frame.addKeyListener(engine2);
		frame.add(mutiplayer, BorderLayout.CENTER);
		frame.setVisible(true);
		
		engine1.start();
		engine2.start();
	}
}