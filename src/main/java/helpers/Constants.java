package helpers;

public interface Constants {

	
	public static final int FRAME_WIDTH = 1000;
    public static final int FRAME_HEIGHT = 600;
    public static final int GAMEMAKER_PANEL_WIDTH = 500;
    public static final int GAMEMAKER_PANEL_HEIGHT = 600;
    public static final int GAME_PANEL_WIDTH = 500;
    public static final int GAME_PANEL_HEIGHT = 600;
    public static final int SPRITES_PANEL_WIDTH = 400;
    public static final int SPRITES_PANEL_HEIGHT = 100;
    public static final int SPRITES_PARENT_HEIGHT = 90;
    public static final int SPRITES_PARENT_WIDTH = 70;
    public static final int BALL_DEFAULT_HEIGHT = 28;
    public static final int BALL_DEFAULT_WIDTH = 28;
    
    //Success status
    public static final int OK = 0;
    
    
    //Game Maker Panel Sprites postions
	public static final int MAKER_BRICK_X = 50;
    public static final int MAKER_BRICK_Y = GAMEMAKER_PANEL_HEIGHT/2;
	public static final int MAKER_BALL_X = 100;
    public static final int MAKER_BALL_Y = GAMEMAKER_PANEL_HEIGHT/2;
    public static final int MAKER_PADDLE_X = 150;
    public static final int MAKER_PADDLE_Y = GAMEMAKER_PANEL_HEIGHT/2;
    
    //Clock timer calculation
    public static final int CLOCK_INTERVAL = 20;;
    
    //images
	 public static final String PIC_BACKGROUND = "/gameBackground.jpg";
	 public static final String PIC_BACKGROUND2 = "/background.jpg";
	 public static final String PIC_BACKGROUND3 = "/background3.jpg";
	 public static final String PIC_BACKGROUND4 = "/background4.jpg";
	 public static final String PIC_BACKGROUND5 = "/background5.jpg";
	 public static final String PIC_BACKGROUND6 = "/background6.png";
	 public static final String PIC_BACKGROUND7 = "/background7.jpg";
	 public static final String PIC_HALLOWEEN = "/halloween.jpg";
	 
	 
	 public static final String PIC_GAMEMAKER = "/gameMaker.jpg";
	 public static final String PIC_BALL = "/ball.png";
	 public static final String PIC_BALL2 = "/ball2.png";
	 public static final String PIC_BALL3 = "/ball3.jpg";
	 public static final String PIC_BALL4 = "/ball4.png";
	 public static final String PIC_BALL5 = "/ball5.png";
	 public static final String PIC_BALL6 = "/ball6.jpg";
	 public static final String PIC_BALL7 = "/ball7.png";
	 public static final String PIC_PADDLE ="/paddle.png";
	 public static final String PIC_PADDLE2 ="/paddle1.png";
	 public static final String PIC_PADDLE3 ="/paddle2.png";
	 public static final String PIC_PADDLE4 ="/paddle3.png";
	 
	 public static final String PIC_BRICK1 ="/brick.png";
	 public static final String PIC_BRICK2 ="/brick2.png";
	 public static final String PIC_BRICK3 ="/brick3.png";
	 public static final String PIC_BRICK4 ="/brick4.png";
	 public static final String PIC_SPECIALBRICK1 ="/specialbrick1.png";
	 public static final String PIC_SPECIALBRICK2 ="/specialBrick2.jpg";
	 public static final String PIC_SPECIALBRICK3 ="/specialBrick3.jpg";
	 public static final String PIC_SPECIALBRICK4 ="/specialBrick4.jpg";
	 public static final String PIC_SPECIALBRICK5 ="/specialBrick5.jpg";
	 public static final String PIC_SPECIALBRICK6 ="/specialBrick6.jpg";
	 public static final String PIC_SPECIALBRICK7 ="/specialBrick7.jpg";
	 
	 public static final String SOUND_FILE_FORMAT = ".wav";
    
	//Game Panel ball
	 public static final int BALL_X_START = 245;
	 public static final int BALL_Y_START = 245;
	 
	 
	 public static final int SLOWDOWN = 5;
	 
	 //Game Panel paddle
	 public static final int PADDLE_X_START = 225;
	 public static final int PADDLE_Y_START = 450;
	 
	 //Game Panel brick
	 public static final String PIC_BRICK = "/brick.png";
	 
	 //Game Panel clock
	 public static final int MILLISEC_TO_SEC = 1000;

	 //Sprite Type
	 public static final int BALL = 1;
	 public static final int BRICK = 2;
	 public static final int BUTTON = 3;
	 public static final int CLOCK = 4;
	 public static final int PADDLE = 5;

	 //Sprite Sub-Type
	 public static final int ONE = 1;
	 public static final int TWO = 2;
	 public static final int THREE = 3;
	 public static final int FOUR = 4;
	 public static final int TEN= 10;
	 public static final int FIFTY = 50;
	 public static final int TWOHUNDRED = 200;
	 public static final int PADDLE_HEIGHT = 18;
	 public static final int PADDLE_WIDTH = 72;
	 
	 //File path for Json data
	 public static final String SAVED_GAME_PATH = "json.txt";
	 
	 public static final int ZERO = 0;
	 
	 public static final int MAX_MILLISEC = 1000;
	 public static final int MAX_SEC = 60;
	 public static final int MAX_MIN = 60;
	 
}
