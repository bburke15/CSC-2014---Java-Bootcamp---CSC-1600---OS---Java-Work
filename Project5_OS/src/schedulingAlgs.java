//Brendan Burke
/*schedulingAlgs.java is the class containing method definitions for all
 * simulated algorithms (FCFS, SSF, and the Elevator algorithm). The driver program invokes
 * each of these methods to calculate the number of cylinders the arm must traverse
 * (when using a particular algorithm).*/

import java.util.Arrays; //used by Elev alg for array sorting

public class schedulingAlgs {
	
	//method for FCFS...
	public static void do_FCFS(int[] anArray){ //takes array as input
		int arm_start = 500; //arm begins at cylinder 500
		int[] distance = new int[anArray.length]; //array to hold distance values between cylinders
		/*the first distance, unlike the others which are relative to cylinder positions
		 * in the array passed as input, is relative to the 500 cylinder start...*/ 
		//calc and store the first elem of distance array...
		int dist_1 = Math.abs(arm_start - anArray[0]);
		distance[0] = dist_1;
		int Total = 0;
		/*for FCFS, cylinder #s can be printed out sequentially (normal order of
		 * the array of rand #s) since the alg takes each cylinder as it comes*/ 
		System.out.print("Cylinders \t");
		for(int i=0; i<anArray.length;i++){	
			System.out.printf("%d \t",anArray[i]); //print out cylinder #s
			if(i!=0){
				/*calc distances between cylinders, except for the
				 * first distance which was aleady calc relative to 500 start...*/
				distance[i] = Math.abs(anArray[i] - anArray[i-1]); 		
			}
			
		}
		System.out.printf("\nDistance \t");
		for(int i=0; i<anArray.length;i++){
			System.out.printf("%d \t",distance[i]); //print out distances
			Total = Total + distance[i]; //calculate total distance (# of cyls) traversed
		}
		System.out.printf("Total: %d\n", Total); //print out total distance
	}
	
	//method for SSF...
	public static void do_SSF(int[] anArray){ //takes array as input
		int arm_start = 500; //arms begins at cylinder 500
		int[] distance = new int[anArray.length]; //array to hold distance values between cylinders
		boolean[] check = new boolean[anArray.length]; /*boolean array for checking if cylinder
		has been selected/used already*/
		int Total = 0;
		int[] current = new int[anArray.length]; /*array to hold index for which cylinder 
		position value is being determined*/
		int closest;
		
		//for each cylinder # of array, go through array and find closest cylinder # to seek to next  
		for(int i=0; i<anArray.length;i++ ){
			closest = 1000; //closest value reset for each comparison
			for(int j=0; j<anArray.length;j++){
				if(i==0){ //if determining distance for first element, find cylinder # closest to 500
					int temp = Math.abs(arm_start-anArray[j]); //calc distances between 500 and each elem
					if(temp<closest && check[j] != true){ //if distance value is closest thus far and not yet used then...
						closest = temp; //set new closest distance value
						current[i] = j; //set corresponding index
					}
				}
				else if(i!=0){	//for all other distances...
					int temp2 = Math.abs(anArray[current[i-1]]-anArray[j]); //calc distances between elems
					if(temp2<closest && check[j] != true){ //if closest dist thus far and not yet used then...
						closest = temp2; //set new closest distance value
						//System.out.println("closest" + closest); debugging
						current[i] = j; //set corresponding index
					}
				}		
			}
			distance[i] = closest; //store closest distance value
			check[current[i]] = true; //mark as used
		}
		System.out.print("Cylinders\t");
		
		/* debugging...
		    for(int m=0; m<anArray.length;m++){
			System.out.printf("%d \t",anArray[m]);
		}*/
		// debugging System.out.printf("\n");
		
		//print out cylinder numbers in new SSF order...
		for(int m=0; m<anArray.length;m++){
			System.out.printf("%d \t",anArray[current[m]]);
		}
		
		/* debugging...
		 	for(int p=0; p<anArray.length;p++){
			System.out.printf("\nCurrent\n");
			System.out.printf("%d", current[p]);
			System.out.printf("check " + check[p]);
		}*/
		
		//print out distances... 
		System.out.printf("\nDistance \t");
		for(int k=0; k<anArray.length;k++){
			System.out.printf("%d \t",distance[k]);
			Total = Total + distance[k]; //calc total dist (# of cylinders) traversed
		}
		System.out.printf("Total: %d\n", Total); //print out total distance traversed
	}
	
	//method for Elevator alg...
	public static void do_Elevator(int[] anArray){ //takes array as input
		int arm_start = 500; //arms begins at cylinder 500
		int[] distance = new int[anArray.length]; //array to hold distance values between cylinders
		int Total = 0;
		int temp;
		Arrays.sort(anArray); //sort array elements in ascending order
		//the elevator begins in the upward direction (500 and up), so...
		//move elements lower than 500 (start) to end of array and shift other elems accordingly...
		
		for(int i= anArray.length - 1; i >= 0; i--){ //go through array backwards...
			if(anArray[i] < arm_start){ //if a cylinder position less than 500...
				 temp = anArray[i]; //hold value in temp var
				 for(int k = i; k < anArray.length - 1; k++){ //shift array elements..
					 anArray[k] = anArray[k+1];
				 }	 
				 anArray[anArray.length - 1] = temp; //move (value<500) to end of array
			}	
		}
		
		/*now that cylinders are set in elevator order, distances can 
		be calculated sequentially (i.e. FCFS)*/
		
		int dist_1 = Math.abs(arm_start - anArray[0]);
		distance[0] = dist_1; //first distance is relative to 500 start
		
		//print out cylinder position(already put in elevator order)
		System.out.print("Cylinders \t");
		for(int i=0; i<anArray.length;i++){	
			System.out.printf("%d \t",anArray[i]);
			if(i!=0){
				/*calc distances between cylinders, except for the
				 * first distance which was already calc relative to 500 start...*/
				distance[i] = Math.abs(anArray[i] - anArray[i-1]); //	
			}
			
		}
		System.out.printf("\nDistance \t");
		//print out distances...
		for(int i=0; i<anArray.length;i++){
			System.out.printf("%d \t",distance[i]);
			Total = Total + distance[i]; //calc total distance traversed
		}
		System.out.printf("Total: %d\n", Total); //print out total dist traversed
		
		
	}

	
	

}
