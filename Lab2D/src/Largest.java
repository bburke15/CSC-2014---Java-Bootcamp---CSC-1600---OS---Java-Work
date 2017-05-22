import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer:");
		int a = scan.nextInt();
		System.out.print("Please enter another integer:");
		int b = scan.nextInt();
		System.out.print("And Another:");
		int c = scan.nextInt();
		System.out.print("Another one:");
		int d = scan.nextInt();
		int largest = a;
		if(b>largest){
			largest=b;
		}
		if(c>largest){
			largest=c;
		}
		if(d>largest){
			largest=d;
		}
		System.out.printf("The largest of the four numbers is: %d%n",largest);

	}

}
