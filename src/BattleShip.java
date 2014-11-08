/* BattleShip -- a basic implementation of the classic game
 * */
public class BattleShip {
	public Player player1, player2;
	
	/* CONSTRUCTORS */
	// create a new game
	public BattleShip(){
		player1 = new Player();
		player2 = new Player();
		setupBoards();
	}
	
	/* GETTERS & SETTERS */
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	/* CLASS METHODS */
	public void setupBoards(){
		player1.resetBoard(player1.getShipWatch());
		player1.resetBoard(player1.getEnemyWatch());
		player2.resetBoard(player2.getShipWatch());
		player2.resetBoard(player2.getEnemyWatch());
	}
}
