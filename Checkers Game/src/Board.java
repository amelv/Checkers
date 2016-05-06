
public class Board {
	public final String EMPTY = "0";
	public final String PEICE = "P";
	public final String KING = "K";
	
	public String[][] board;
	private final int LENGTH = 8;
	private final int WIDTH = 8;
	
	public Board () {
		board = new String[8][8];
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				if (r < 3 || r > 4){
					if (r % 2 == 0 && c % 2 == 1)
						board[r][c] = PEICE;
					else if (r % 2 == 1 && c % 2 == 0)
						board[r][c] = PEICE;
					else
						board[r][c] = EMPTY;
				} else {
					board[r][c] = EMPTY;
				}
		
			}
		}
	}
	
	public String peiceAt(int row, int col) {
		return board[row][col];
	}
	
	
	public String toString() {
		String boardString = "";
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				boardString += board[r][c];
			}
			boardString += "\n";
		}
		return boardString;
	}
}
