package views;

import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import controllers.ButtonsPanelController;
import controllers.CollideActionListenerController;
import controllers.BackGroundActionListenerController;
import controllers.ControllActionListenerController;
import controllers.MoveActionListenerController;
import controllers.SoundActionListenerController;
import controllers.SpriteActionListenerController;
import game.TopOptionBarView;
import helpers.Constants;
import models.UserOption;
import services.GameStatus;

@SuppressWarnings("serial")
public class GameMakerView extends JPanel {

	private GamePanelView gamePanelView;
	private UserOption userOption;

	public GameMakerView(GamePanelView gamePanelView) {

		this.setPreferredSize(new Dimension(Constants.GAMEMAKER_PANEL_WIDTH, Constants.GAMEMAKER_PANEL_HEIGHT));
		this.setBounds(0, 0, Constants.GAMEMAKER_PANEL_WIDTH, Constants.GAMEMAKER_PANEL_HEIGHT);
		this.gamePanelView = gamePanelView;
		this.userOption = new UserOption();
		FlowLayout gameMakerLayout = new FlowLayout();
		this.setLayout(gameMakerLayout);
	}
	
	
	 
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		BufferedImage image;
		try {
			image = ImageIO.read(getClass().getResourceAsStream(Constants.PIC_BACKGROUND5));
			g2d.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addShapes() throws IOException {

		//Main Panel
		JPanel gameMakerImagePanel = new JPanel();
		
		gameMakerImagePanel.setOpaque(false);
	
		gameMakerImagePanel.setPreferredSize(new Dimension(Constants.GAMEMAKER_PANEL_WIDTH, Constants.GAMEMAKER_PANEL_HEIGHT/3));
		
		//Dragable Sprites Panel
		SpritesPanel spritesPanel = new SpritesPanel();
		this.add(spritesPanel);		
		
		JPanel spritesListPanel = new JPanel();
		spritesListPanel.setOpaque(false);
		String[] sprites = { "Select Sprite", "Ball", "Brick", "Clock", "Paddle", "SpecialBrick" };
		JComboBox spriteListCombo = new JComboBox(sprites);
		spritesListPanel.add(spriteListCombo);
		this.add(spritesListPanel);
		
		ActionListener spriteListener = new SpriteActionListenerController(spriteListCombo, spritesPanel,this.userOption);
		spriteListCombo.addActionListener(spriteListener);

		//Top option for Save and Load
		TopOptionBarView topOptionBarView = new TopOptionBarView(this, this.gamePanelView);
		topOptionBarView.attachAction();
		this.add(topOptionBarView);
		
		JButton clockButton = new JButton("Add Clock");
		this.add(clockButton);
		clockButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				GameStatus.setClockAdded(true);	
			}
		});
		
		JPanel combosListPanel = new JPanel();
		BoxLayout boxLayout = new BoxLayout(combosListPanel, BoxLayout.Y_AXIS);
		combosListPanel.setLayout(boxLayout);
		//combosListPanel.setBackground(Color.PINK);
		combosListPanel.setOpaque(false);
		this.add(combosListPanel);
		
		String[] sounds = { "Loud Ping", "Soft Ping" };
		JComboBox soundsList = new JComboBox(sounds);
		combosListPanel.add(soundsList);
		ActionListener soundListener = new SoundActionListenerController(soundsList, this.userOption);
		soundsList.addActionListener(soundListener);
		
		
		String[] actions = { "Move Horizontal", "Move Vertical", "Move Horizontal And Vertical", "No Movement" };
		JComboBox actionsList = new JComboBox(actions);
		combosListPanel.add(actionsList);
		ActionListener actionsListener = new MoveActionListenerController(actionsList,this.userOption);
		actionsList.addActionListener(actionsListener);
		
		
		String[] collideActions = { "Bounce", "BlowUp" , "No Collide Action" };
		JComboBox collideActionsList = new JComboBox(collideActions);
		combosListPanel.add(collideActionsList);
		ActionListener collideActionctionsListener = new CollideActionListenerController(collideActionsList,this.userOption);
		collideActionsList.addActionListener(collideActionctionsListener);

		String[] events = { "Auto Controll","Mouse Controll", "Keyboard Controll" };
		JComboBox eventsList = new JComboBox(events);
		combosListPanel.add(eventsList);
		ActionListener eventsListener = new ControllActionListenerController(eventsList,this.userOption);
		eventsList.addActionListener(eventsListener);
		

		String[] buttons = { "Add Buttons", "Start Button", "Stop Button" };
		JComboBox buttonsList = new JComboBox(buttons);
		combosListPanel.add(buttonsList);
		ActionListener buttonsListener = new ButtonsPanelController(gamePanelView, buttonsList);
		buttonsList.addActionListener(buttonsListener);

		
		String[] backGround = { "Select BackGround", "Dessert", "Sky", "Clouds", "Peace", "Halloween", "Pink"};
		JComboBox backGroundList = new JComboBox(backGround);
		combosListPanel.add(backGroundList);
		ActionListener backGroundListener = new BackGroundActionListenerController(backGroundList, gamePanelView);
		backGroundList.addActionListener(backGroundListener);
		
	}

}
