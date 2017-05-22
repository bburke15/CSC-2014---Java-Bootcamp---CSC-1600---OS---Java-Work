import java.util.*;
public class Time {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a time duration...");
		System.out.println("Hours:");
		int h = scan.nextInt();
		System.out.print("Minutes:");
		int m = scan.nextInt();
		System.out.print("Seconds:");
		int s = scan.nextInt();
		int tot = s + 60*m + 3600*h;
		System.out.printf("%d hour(s), %d minute(s), and %d second(s) is equivalent to %d seconds.%n", h, m, s, tot);

	}

}
