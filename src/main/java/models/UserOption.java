package models;

public class UserOption {

	public UserOption() {
		super();
		this.movement = "MoveHorizontal";
		this.control  = "AutoControll";
		this.collideAction = "Bounce";
		this.sound = null;
		// TODO Auto-generated constructor stub
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getMovement() {
		return movement;
	}
	public void setMovement(String movement) {
		this.movement = movement;
	}
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}
	private String sound;
	private String movement;
	private String control;
	private String collideAction;
	public String getCollideAction() {
		return collideAction;
	}
	public void setCollideAction(String collideAction) {
		this.collideAction = collideAction;
	}
}
