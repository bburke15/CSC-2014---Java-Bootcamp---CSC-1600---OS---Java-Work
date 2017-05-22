import java.util.Scanner;

public class Many {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Finding the maximum of some values. How many will there be?");
		int amount = scan.nextInt();
		int array[]=new int[amount];
		System.out.printf("Please enter %d numbers, separated by spaces:%n", amount);
		for(int i=0; i<amount; i++){
			array[i]= scan.nextInt();
		}
		int largest = array[0];
		for(int j=0; j<amount; j++){
		if(array[j]>largest){
			largest=array[j];
		}
		}
		System.out.printf("The largest value entered is %d%n", largest);

	}

}
