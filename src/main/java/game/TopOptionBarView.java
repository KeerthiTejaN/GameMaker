package game;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.TopOptionBarController;
import helpers.Constants;
import views.GameMakerView;
import views.GamePanelView;


@SuppressWarnings("serial")
public class TopOptionBarView extends JPanel {
	
	public synchronized JButton getSaveGameMakerbutton() {
		return saveGameMakerbutton;
	}
	public synchronized void setSaveGameMakerbutton(JButton saveGameMakerbutton) {
		this.saveGameMakerbutton = saveGameMakerbutton;
	}
	public synchronized JButton getLoadGameMakerButton() {
		return loadGameMakerButton;
	}
	public synchronized void setLoadGameMakerButton(JButton loadGameMakerButton) {
		this.loadGameMakerButton = loadGameMakerButton;
	}
	private JButton saveGameMakerbutton;
	private JButton loadGameMakerButton;
	private GameMakerView GameMakerPanelView;
	public GameMakerView getGameMakerPanelView() {
		return GameMakerPanelView;
	}
	public void setGameMakerPanelView(GameMakerView gameMakerPanelView) {
		GameMakerPanelView = gameMakerPanelView;
	}
	private GamePanelView gamePanelView;
	
	public TopOptionBarView(GameMakerView GameMakerPanelView, GamePanelView GamePanelView) {
		// TODO Auto-generated constructor stub
	
	this.saveGameMakerbutton = new JButton("Save ");
	this.loadGameMakerButton = new JButton("Load ");
	this.GameMakerPanelView  = GameMakerPanelView;
	this.gamePanelView       = GamePanelView;
	this.setLayout(new FlowLayout());
	this.add(this.saveGameMakerbutton);
	this.add(this.loadGameMakerButton);
	this.setOpaque(false);
	setVisible(true);	
	}
	
	public int attachAction(){
		
		this.saveGameMakerbutton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new TopOptionBarController().saveGameMaker(gamePanelView.getObserverList());
			}
		});
		
		this.loadGameMakerButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gamePanelView.getObserverList().addAll(new TopOptionBarController().loadGameMaker(gamePanelView.getObserverList(), gamePanelView));
				gamePanelView.revalidate();
				gamePanelView.repaint();
			}
		});
		return Constants.OK;	
	
	}


}
