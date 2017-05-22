import java.io.*;
import java.util.*;

public class filein {

	public static void main(String[ ] args) throws IOException {
	    File input = new File("hemingway-old-man.txt");
	    String content = new Scanner(input).useDelimiter("\\Z").next();
	    System.out.println("The length of the string is: ");
	    System.out.println(content.length());
	    
	    final int NUMCHARS = 26;
	    int[] upper = new int[NUMCHARS];
	    int[] lower = new int[NUMCHARS];
	    char current;   // the current character being processed
	    int other = 0;  // counter for non-alphabetics
	    //  Count the number of each letter occurrence
	    for (int ch = 0; ch < content.length(); ch++)
	    {
	    	current = content.charAt(ch);
	    	if (current >= 'A' && current <= 'Z')
	    		upper[current-'A']++;
	    	else
	    		if (current >= 'a' && current <= 'z')
	    			lower[current-'a']++;
	    		else
	    			other++;
	    }
	    
	//  Print the results
	      System.out.println ();
	      for (int letter=0; letter < upper.length; letter++)
	      {
			 System.out.print((char) (letter + 'A'));
			 for(int l=0;l<(upper[letter]/10);l++){
				 System.out.printf("#");
			 }
			 System.out.printf("(%d)",upper[letter]);
			 System.out.printf("%n");
		  }
	      System.out.println ();
	      for (int letter2=0; letter2 < lower.length; letter2++)
	      {
			 System.out.print((char) (letter2 + 'a'));
			 for(int j=0;j<(lower[letter2]/1000);j++){
				 System.out.printf("#");
			 }
			 System.out.printf("(%d)",lower[letter2]);
			 System.out.printf("%n");
		  }
	      System.out.println ("Non-alphabetic characters: " + other);
	}

}
