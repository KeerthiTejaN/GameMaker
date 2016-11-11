package services;

public class GameStatus {

	private static boolean gameStopped = false;
	private static boolean gameStarted = false;
	private static boolean clockAdded = false;
	
	
	public static synchronized boolean isClockAdded() {
		return clockAdded;
	}
	public static synchronized void setClockAdded(boolean clockAdded) {
		GameStatus.clockAdded = clockAdded;
	}
	
	public static synchronized boolean isGameStopped() {
		return gameStopped;
	}
	public static synchronized void setGameStopped(boolean gameStopped) {
		GameStatus.gameStopped = gameStopped;
	}
	public static synchronized boolean isGameStarted() {
		return gameStarted;
	}
	public static synchronized void setGameStarted(boolean gameStarted) {
		GameStatus.gameStarted = gameStarted;
	}
	
}
