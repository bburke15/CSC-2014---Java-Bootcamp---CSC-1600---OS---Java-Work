//Brendan Burke
/*Proj5.java is the driver program for algorithm simulation. Proj5.java generates 12 sets of
 * sequences of cylinder numbers (0-999) at random. Random numbers come from a uniform distribution,
 * and a set (there are 12) of 12 random numbers is stored in an array. For each set, Proj5.java invokes each
 * of the methods for algorithm simulation, passing the particular array of 12 random numbers (number of
 * cylinders) as input to each method in every case (for each set). Print statements are used
 * to make the output more readable (headers to indicate set #, and what algorithm).*/
/*Project 5 involves writing a program to implement three disk-arm scheduling algorithms:
 *First-Come,First-Served (FCFS), Shortest Seek First (SSF), and the Elevator algorithm. 12 sets
 *of 12 random numbers are generated (representing 12 sets of numbers of cylinders), and, for
 *each of the sets, the three algorithms are run for that particular set (of cylinder numbers).
 *Each of the algorithms prints out the total distance (number of cylinders) the arm needs to traverse 
 *for that set of cylinder numbers.*/

import java.util.Random; //need for rand # generation

public class Proj5 {

	public static void main(String[] args) {
		//need to generate 12 sets of sequences of cylinder #s (0-999) at random
		Random rand = new Random();
		int Size = 12;
		int[] anArray = new int[Size]; //array for set of 12 rand #s (cylinder #s)
		
		int set = 1;
		while(set<=12){ //perform three algorithms on 12 sets of rand #s
			
			/*populate size 12 array with 12 random #s uniformly
			distributed between 0 and 999 (represent cylinder numbers)...*/
			for(int i=0;i<Size;i++){
			anArray[i] = rand.nextInt(1000);	
			}
				
			System.out.printf("\tSet %d FCFS\n",set); //formatting for console (what alg, and set #)
			schedulingAlgs.do_FCFS(anArray); //invoke method to perform FCFS on array of rand #s
			System.out.printf("\n\n\n");
			System.out.printf("\tSet %d SSF\n",set); //formatting for console (what alg, and set #)
			schedulingAlgs.do_SSF(anArray); //invoke method to perform SSF on array of rand #s
			System.out.printf("\n\n\n");
			System.out.printf("\tSet %d Elevator\n",set); //formatting for console (what alg, and set #)
			schedulingAlgs.do_Elevator(anArray); //invoke method to perform Elevator alg on array of rand #s
			System.out.printf("\n\n\n");
			set++; //increment set #
		}

	}

}
