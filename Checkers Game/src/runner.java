import java.util.Scanner;
public class runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Board board = new Board();
		int turnCount = 0, s = 1, oldX=-1, oldY=-1, newX=-1, newY=-1;
		boolean legal;
		while(s != 0)
		{
			board.print();
			System.out.println("\n");
			oldX=-1;
			oldY=-1;
			newX=-1;
			newY=-1;
			
			if(turnCount%2==0)
				System.out.println("---------------White's Move---------------");
			else
				System.out.println("---------------Black's Move---------------");
			
			System.out.print("How many moves/jumps:");
			
			s=scan.nextInt();
			int[][] moves = new int [s+1][2];
			legal=false;
			
			while(!legal)
			{
				System.out.print("What is your starting position:");
				moves[0][0]=scan.nextInt();
				moves[0][1]=scan.nextInt();
				for(int i=1;i<=s;i++)
				{
						System.out.print("What is move " + i + ":");
						moves[i][0]=scan.nextInt();
						moves[i][1]=scan.nextInt();
				}
				legal= board.isLegalMove(moves,turnCount%2);
				if(!legal)
					System.out.println("Not a legal move");
			}
			if(legal)
			{
				
			}
			turnCount++;
		}

	}
}
