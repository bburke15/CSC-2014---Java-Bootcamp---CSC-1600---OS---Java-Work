import java.io.*;
import java.util.*;
public class partg
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws IOException
   {
	  Scanner in = new Scanner(new File("lab3data.txt"));
	  int row1 = in.nextInt();
	  int col1 = in.nextInt();
      int[][] table = new int[row1][col1];
      int sum=0;
      int sum1=0;
      double average,ov;
 

      //Load the table with values
      for (int row=0; row < table.length; row++)
         for (int col=0; col < table[row].length; col++)
      		table[row][col]=in.nextInt();
      

      // Print the table
      System.out.printf("#|\t");
      for(int row=0;row<1;row++)
    	  for(int col=0; col<table[row].length; col++)
    		  System.out.printf("%d\t",col);
      System.out.printf("\n___________________________________________________________________\n");
      for (int row=0; row < table.length; row++)
      {
    	  System.out.printf("%d|\t",row);
    	  sum=0;
         for (int col=0; col < table[row].length; col++){
        	 sum += table[row][col];
        	 sum1 += table[row][col];
        	 System.out.print (table[row][col] + "\t");}
         average = ((double)sum) / table[row].length;
         System.out.printf("%8.1f", average);
         System.out.println();
         
      }
      ov = ((double)sum1) / (row1*col1);
      System.out.printf("Overall average:%8.1f",ov);
}
}
