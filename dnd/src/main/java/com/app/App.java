package com.app;

import java.util.Scanner;

import com.characters.*;
import com.parents.*;
import com.interfaces.*;

public class App {

	public static void main(String[] args) {
		boolean userInputCorrect = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Welcome to ssa dnd!\nChoose your character:\n"
				+ "1- Human Wizard\n2- Elf Royal\n3- Twi'lek Jedi\n4- Smurf Warrior\n5- Turtle Ninja\n6- Exit");
			String userInput = sc.nextLine();
		
		
			switch (userInput) {
			case "1":
				HumanWizard hw = new HumanWizard();
				//Call to HumanWizard methods here
				break;
			case "2":
				ElfRoyal er = new ElfRoyal();
				//ElfRoyal...
				break;
			case "3":
				TwilekJedi tj = new TwilekJedi();
				//Twi'lekJedi...
				break;
			case "4":
				SmurfWarrior sw = new SmurfWarrior();
				//SmurfWarrior
				break;
			case "5":
				TurtleNinja tn = new TurtleNinja();
				//TurtleNinja
				break;
			case "6":
				System.out.println("Goodbye");
				System.exit(0);
			default:
				System.out.println("Invalid Selection, please choose 1,2,3,4 or 5\n");
				userInputCorrect = true;
				break;
			}
		} while (userInputCorrect);
		sc.close();
	}//main

}//class
