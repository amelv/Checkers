
public class Board {
	public final String EMPTY = "0";
	public final String PEICE = "P";
	public final String KING = "K";
	
	public String[][] board;
	private final int LENGTH = 8;
	private final int WIDTH = 8;
	
	public Board () {
		board = new String[8][8];
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 8; c++) {
			}
		}
	}
}
