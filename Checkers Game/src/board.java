import java.util.Arrays;



public class board {
	private CheckersPeice[][] array;
	private int row;
	private int col;
	
	public board()
	{
		array = new CheckersPeice[8][8];
		row = array.length;
		col = array[0].length;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i % 2 == 0)
				{
					if(j % 2 == 0)
					{
						if(i <= 2) 
							array[i][j] = new CheckersPeice("WP");
						else if(i >= row-3)
							array[i][j] = new CheckersPeice("BP");
						else
							array[i][j] = new CheckersPeice("0");
					}
					else
						array[i][j] = new CheckersPeice();
				}


				else
				{
					if(j % 2 != 0)
					{
						if(i <= 2) 
							array[i][j] = new CheckersPeice("WP");
						else if(i >= row-3)
							array[i][j] = new CheckersPeice("BP");
						else
							array[i][j] = new CheckersPeice("0");
					}
					else
						array[i][j] = new CheckersPeice();
				}
			}
		}
	}
	public void print()
	{
		
		for (int i = 0; i < row; i++) {
			System.out.println("\n\n");
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j]+ "\t");
			}

		}
	}


	public boolean isLegalMove(int[][] moves, int turn)
	{
		boolean legal = true;
		if((array[moves[0][0]][moves[0][1]].toString().charAt(0)=='W' && turn==0) 
				|| (array[moves[0][0]][moves[0][1]].toString().charAt(0)=='B' && turn==1))
		{
			for(int i=1;i<moves[0].length;i++)
			{
				if(array[moves[i][0]][moves[i][1]].toString().charAt(0)!='0')
				{
					legal = false;
				}
			}
			if(legal)
			{
				if(moves[0].length==2 && (Math.abs(moves[0][0]-moves[1][0])==1 
						&& Math.abs(moves[0][1]-moves[1][1])==1))
						{
							move(moves[0][0], moves[0][1], moves[1][0], moves[1][1], turn);
						}
			}
			return legal;
		}
		else
			return false;

	}


	private void move(int oldX, int oldY, int newX, int newY, int turn)
	{
		array[newX][newY]= new CheckersPeice(array[oldX][oldY].toString());
		array[oldX][oldY]= new CheckersPeice("0");

	}

}
