//********************************************************************
//  PalindromeTester.java
//
//  Demonstrates the use of nested while loops.
//********************************************************************

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class palindrome {
	//-----------------------------------------------------------------
	   //  Tests strings to see if they are palindromes.
	   //-----------------------------------------------------------------
	public static void main(String[] args)throws IOException {
		String str, improved;
	    int left, right;
	   

	     
	     //System.out.println ("Enter a potential palindrome:");
	    
	    File input = new File("palindrome.txt");
	    Scanner scan = new Scanner (input);
	    int i=0;
	    for(;i<20;i++){
		str=scan.nextLine();
		improved = str.replaceAll(" ", "");

	     left = 0;
	     right = improved.length() - 1;

	     while (improved.charAt(left) == improved.charAt(right) && left < right)
	     {
	    	 left++;
	         right--;
	     }

	     System.out.println();

	     if (left < right)
	            System.out.printf ("%s is NOT a palindrome.",str);
	     else
	            System.out.printf ("%s IS a palindrome.",str);
	    }

	     System.out.println();
	     System.out.println("done");

	}

}
