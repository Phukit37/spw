package f2.spw;

import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Timer;


public class GameEngine2 implements KeyListener, GameReporter{
	GamePanel gp;
	
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();	
	private SpaceShip v;	
	
	private Timer timer;
	
	private long score = 0;
	private double difficulty = 0.1, val = 0;
	private int count;


	
	public GameEngine2(GamePanel gp, SpaceShip v) {
		this.gp = gp;
		this.v = v;		
		
		gp.sprites.add(v);
		
		timer = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				process();
			}
		});
		timer.setRepeats(true);
		
	}
	
	public void start(){
		timer.start();
	}
	
	private void generateEnemy(){
		Enemy e = new Enemy((int)(Math.random()*390), 30);
		gp.sprites.add(e);
		enemies.add(e);
	}
	
	private void process(){
		if(Math.random() < difficulty){
			generateEnemy();
		}
		Iterator<Enemy> e_iter = enemies.iterator();
		while(e_iter.hasNext()){
			Enemy e = e_iter.next();
			e.proceed();

			if(!e.isAlive()){
				e_iter.remove();
				gp.sprites.remove(e);
				score += countscore();
				count++;
				if(count == 0){
					difficulty =0.1;
				}
				if(count == 50){
					difficulty =0.15;
				}
				if(count == 100){
					difficulty =0.2;
				}
				if(count == 150){
					difficulty =0.25;
				} 
				if(count == 250){
					difficulty =0.3;
				}
				if(count == 400){
					difficulty =0.35;
				}
				if(count == 800){
					difficulty =0.4;
				} 
			}
		  }
		gp.updateGameUI(this);
		
		Rectangle2D.Double vr = v.getRectangle();
		Rectangle2D.Double er;
		for(Enemy e : enemies){
			er = e.getRectangle();
			if(er.intersects(vr)){
				die();
				return;
			}
		}
	}
	
	public void die(){
		timer.stop();
	}
	
	void controlVehicle(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A:
			v.move(-1);
			break;
		case KeyEvent.VK_D:
			v.move(1);
			break;
		}
	}

	public long getScore(){
		return score;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		controlVehicle(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//do nothing
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//do nothing		
	}
	public long countscore(){
		if (difficulty == 0.1){
			score = 10;
		}

		if (difficulty == 0.15){
			score = 20;
		}

		if (difficulty == 0.2){
			score = 30;
		}

		if (difficulty == 0.25){
			score = 40;
		}
		if (difficulty == 0.3){
			score = 50;
		}

		if (difficulty == 0.35){
			score = 60;
		}

		if (difficulty == 0.4){
			score = 70;
		}

		if (difficulty == 0.45){
			score = 80;
		}
		return score;
	}
}
