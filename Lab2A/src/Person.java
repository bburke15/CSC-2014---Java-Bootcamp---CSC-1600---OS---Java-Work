import java.util.*;
public class Person {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter name:");
		String s = scan.nextLine();
		System.out.print("Please enter pet name:");
		String s2 = scan.nextLine();
		System.out.println("Please enter age:");
		String s3 = scan.nextLine();
		System.out.printf("Hello, my name is %s and I am %s years old. I'm%n", s,s3);
		System.out.println("enjoying my time at Villanova, though I miss my");
		System.out.printf("pet %s very much!%n",s2);

	}

}
