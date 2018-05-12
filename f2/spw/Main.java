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

		
		SpaceShip v1 = new SpaceShip(150, 550, 20, 20);
		GamePanel gp1 = new GamePanel();
		GameEngine engine1 = new GameEngine(gp1, v1);
		SpaceShip v2 = new SpaceShip(150, 550, 20, 20);
		GamePanel gp2 = new GamePanel();
		GameEngine2 engine2 = new GameEngine2(gp2, v2);

		mutiplayer.add(gp1);
		mutiplayer.add(gp2);
		frame.addKeyListener(engine1);
		frame.addKeyListener(engine2);
		frame.add(mutiplayer, BorderLayout.CENTER);
		frame.setVisible(true);
		
		engine1.start();
		engine2.start();
	}
}