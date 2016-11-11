package controllers;

import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

import javax.swing.JPanel;

import helpers.Constants;
import models.Sprites;
import services.GameStatus;

public class GameLogicController extends TimerTask{
	
	private ArrayList<Sprites> observerList;
	private JPanel gamePanelView;
	private final CountDownLatch latch;
	
	public GameLogicController(ArrayList<Sprites> observerList, JPanel gamePanelView, CountDownLatch latch) {
		this.observerList = observerList;
		this.gamePanelView = gamePanelView;
		this.latch = latch;
	}

	@Override
	public void run() {
		
		// While Game is being played.
		if(GameStatus.isGameStopped()==false && GameStatus.isGameStarted() == true){

			for(Sprites observer: observerList){
					 observer.move();
			}
			
	    // Detect and handle collisions between different objects.
			handleCollisions();
    	}

		// Repaint the GamePanelView panel
		if(GameStatus.isGameStopped() == false){
			gamePanelView.revalidate();
			gamePanelView.repaint();
		}
		
		latch.countDown();
	}
	
	public int handleCollisions(){
		for(int i=0; i<observerList.size()-1; i++){
			for(int j=i+1; j<observerList.size(); j++){
				
				// If any two Sprites collide
				if(observerList.get(i).intersectRect().intersects(observerList.get(j).intersectRect())){
					
					observerList.get(i).playCollisionSound();
					observerList.get(j).playCollisionSound();
					observerList.get(i).getCollideAction().actionAfterCollision();
					observerList.get(j).getCollideAction().actionAfterCollision();
			
					}
				}
				

			}//1st for loop end
		return Constants.ONE;
		}//handleCollisions end
		
}
