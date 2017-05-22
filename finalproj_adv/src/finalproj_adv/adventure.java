package finalproj_adv;

import java.util.Random;

import java.util.Scanner;

public class adventure {

	public static void main(String[] args) {

		// System objects
		Scanner inputs = new Scanner(System.in);
		Random rand = new Random();
		
		//Game Variables
		String[] enemies_ice = {"Trevor", "Derek", "Wayne", "Bobby" };
		String[] enemies_stamp = {"Phyllis", "Debbie", "ERAT (\"up and coming\" rapper)", "Spalding"};
		
		System.out.println("What's your name (if you don't mind me asking)?");
		String name = inputs.nextLine();
		System.out.println("Hello, " + name + ".");
		Exposition.exposition_grad();
		Exposition.exposition(name);
	
		
		System.out.println("--------------------------------------");
		System.out.println("So, what's your answer? What will you do next with your life?");
		System.out.println("\t1. Go to College");
		System.out.println("\t2. Crash in Parents' basement until whenever");
		String choice = inputs.nextLine();
		if(choice.equals("1")){
			Exposition.exposition_college_intro();
			System.out.println("Which of these three clubs do you want to sign on for?");
			System.out.println("\t1. Bakers' Club");
			System.out.println("\t2. Stamp Appreciation Club");
			System.out.println("\t3. Club Ice Hockey");
			String club = inputs.nextLine();
				
			if(club.equals("1")){
				Exposition.exposition_college_baker();
				System.out.println("--------------------------------------");
				System.out.println("What do you do?");
				System.out.println("\t1. Do the right thing and find a club without drugs");
				System.out.println("\t2. Give it a chance and, you know, just see what it's like");
				Exposition.exposition_drugs();
				}
			else if (club.equals("2")){
				Exposition.exposition_college_stamps_intro();
				Exposition.exposition_college_stamps();
				Exposition.fight(enemies_stamp);
			}
			else if(club.equals("3")){
				Exposition.exposition_college_hockey_intro();
				Exposition.exposition_college_hockey();
				Exposition.fight(enemies_ice);
			}
			else{
			System.out.println("\tInvalid command");
			}
		}
		else if(choice.equals("2")){
			Exposition.exposition_sedentary();
		}
	}
	
	
}