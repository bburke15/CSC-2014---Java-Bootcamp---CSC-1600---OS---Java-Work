import java.util.*;
public class TimeRev {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a time duration in seconds...");
		System.out.println("Total time in seconds:");
		int s = scan.nextInt();
		int hours = s/3600;
		int minutes = (s - (hours*3600))/60;
		int seconds = (s - (hours*3600) - (minutes*60));
		System.out.printf("%d seconds is equivalent to %d hour(s), %d minute(s), and %d second(s).%n", s, hours, minutes, seconds);


	}

}
