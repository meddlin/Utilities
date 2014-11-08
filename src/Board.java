import java.util.Arrays;


public class Board {
	Region[][] board;
	
	// generate a Region[10][10] game to play in
	public Board(){
		board = new Region[10][10];
	}

	@Override
	public String toString() {
		return "Board [board=" + Arrays.toString(board) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	};
	

}
