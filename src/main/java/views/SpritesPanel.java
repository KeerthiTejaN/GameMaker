package views;

import java.awt.Dimension;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import dragtree.DragSourceComponent;
import helpers.Constants;

@SuppressWarnings("serial")
public class SpritesPanel extends JPanel{

	private ArrayList<DragSourceComponent> spritesList;
	
	public synchronized ArrayList<DragSourceComponent> getSpritesList() {
		return spritesList;
	}

	public synchronized void setSpritesList(ArrayList<DragSourceComponent> spritesList) {
		this.spritesList = spritesList;
	}

	public SpritesPanel() {
		// TODO Auto-generated constructor stub
		
		FlowLayout flowLayOutSpritesPanel = new FlowLayout();
		this.setLayout(flowLayOutSpritesPanel);
		this.setPreferredSize(new Dimension(Constants.SPRITES_PANEL_WIDTH, Constants.SPRITES_PANEL_HEIGHT));
		this.setOpaque(false);
		this.spritesList = new ArrayList<DragSourceComponent>();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
