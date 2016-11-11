package controllers;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import helpers.Constants;
import views.GamePanelView;

public class BackGroundActionListenerController implements ActionListener {

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public GamePanelView getGamePanelView() {
		return gamePanelView;
	}

	public void setGamePanelView(GamePanelView gamePanelView) {
		this.gamePanelView = gamePanelView;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	private JComboBox<String> comboBox;
	GamePanelView gamePanelView;
	Image image;

	public BackGroundActionListenerController(JComboBox<String> comboBox, GamePanelView gamePanelView) {
		this.comboBox = comboBox;
		this.gamePanelView = gamePanelView;
	}

	public void actionPerformed(ActionEvent e) {
		String stringName = (String) this.comboBox.getSelectedItem();
		
		if(stringName == "Dessert"){
			image = new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND)).getImage();
			gamePanelView.setBackGround(image);

		}
		
		else if(stringName == "Sky"){
			image = new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND2)).getImage();
			gamePanelView.setBackGround(image);
			gamePanelView.revalidate();
			gamePanelView.repaint();
			
		}
		
		else if(stringName == "Clouds"){
			image = new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND4)).getImage();
			gamePanelView.setBackGround(image);
			gamePanelView.revalidate();
			gamePanelView.repaint();
			
		}
		
		else if(stringName == "Peace"){
			image = new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND3)).getImage();
			gamePanelView.setBackGround(image);
			gamePanelView.revalidate();
			gamePanelView.repaint();
			
		}
		
		else if(stringName == "Halloween"){
			image = new ImageIcon(this.getClass().getResource(Constants.PIC_HALLOWEEN)).getImage();
			gamePanelView.setBackGround(image);
			gamePanelView.revalidate();
			gamePanelView.repaint();
			
		}
		
		else if(stringName == "Pink"){
			image = new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND7)).getImage();
			gamePanelView.setBackGround(image);
			gamePanelView.revalidate();
			gamePanelView.repaint();

		}
	}

}
