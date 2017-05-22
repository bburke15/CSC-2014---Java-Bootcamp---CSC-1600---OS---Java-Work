import java.util.Random;
import java.util.Scanner;


//********************************************************************
//  MazeSearch.java
//
//  Demonstrates recursion.
//********************************************************************

public class MazeSearch
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, attempts to
   //  solve it, and prints out its final form.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	  int row, column;
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.print("Enter number of rows and columns\n");
	  row = scan.nextInt();
	  column = scan.nextInt();
	  int[][] maz = new int[row][column];
	  for(int i=0; i<row; i++){
		  for(int j=0; j<column; j++){
			  if((i==0 && j==0) || (i==row && j==column))
					maz[i][j] = 1;
			  if((i%(int) (Math.random()*3+1)==0 || j%(int) (Math.random()*3+1)==0))
				  maz[i][j]=1;
		  }
	  }
      
      Maze labyrinth = new Maze(maz);
      
      System.out.println (labyrinth);

      if (labyrinth.traverse (0, 0))
         System.out.println ("The maze was successfully traversed!");
      else
         System.out.println ("There is no possible path.");

      System.out.println (labyrinth.toMazeString());
   }
}
