import java.io.*;
import java.util.Scanner;

public class Titanic {

	public static void main(String[] args) throws FileNotFoundException {
		PassengerData many = new PassengerData();
		int boy=0;
		int girl=0;
		int men=0;
		int women=0;
		int children=0;
		File input = new File("titanic.txt");
	    //String content = new Scanner(input).useDelimiter("\\Z").next();
		Scanner in = new Scanner(input);
        while (in.hasNext())
        {
        	int stat = in.nextInt();
	    	boolean kid = in.nextBoolean();
	    	String gen= in.next();
	    	boolean surv = in.nextBoolean();
	    	boolean isFemale = gen.equals("female");
		    boolean isMale = gen.equals("male");
		      if(isMale){
		    	  if(kid==true){
		    		  boy++;
		    	  }
		    	  else{
		    		  men++;
		    	  }
		      }
		      else if(isFemale){
		    	  if(kid==true){
		    		  girl++;
		    	  }
		    	  else{
		    		  women++;
		    	  }
		      }
		    children = girl + boy;
	    	
	    	many.addPassenger(stat, kid, gen, surv);  
        }

        System.out.printf("Number of men: %d%n",men);
        System.out.printf("Number of women: %d%n",women);
        System.out.printf("Number of children: %d%n",children);
        System.out.printf("Number of boys: %d%n",boy);
        System.out.printf("Number of girls: %d%n",girl);
	    System.out.println(many);

	    

	}

}
