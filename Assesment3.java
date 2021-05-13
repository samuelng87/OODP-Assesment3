package assesment3;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assesment3 {

	public static void main(String[] args) {
		welcomeMessage();
		printStars();
		int option = printMenu();
		handleMenu(option);
	}

	// enter the name before the welcome message
	public static void welcomeMessage() {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.next();
		Date date = java.util.Calendar.getInstance().getTime();
		printStars();
		System.out.println("\n\nHi " + name + " WELCOME TO RIDE-SHARING CHARGES ESTIMATOR AND COMPARISON SYSTEM");
		System.out.println("Developed by Koki, Ashmit, Saroj and Samuel Student IDs K200885 K210080 K210095 K210032");
		System.out.println("OODP101 Object Oriented Design and Programming");
		System.out.println(date + "\n");
	}

	// printing star line
	public static void printStars() {
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
		}
	}

	// enter distance
	public static int kiloMeters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nEnter the distance to travel:");
		int kms = sc.nextInt();
		return kms;
	}

	// enter month
	public static int travelMonth() {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Month of travel?");
		month = sc.nextInt();

		while (month < 1 || month > 12) {
			System.out.println("Error!! Please enter the correct Month");
			month = sc.nextInt();
		}

		return month;
	}

	// enter date
	public static int traveldate() {
		int date;
		Scanner sc = new Scanner(System.in);
		System.out.println("On which date of this month, you would like to travel?");
		date = sc.nextInt();

		while (date < 1 || date > 31) {
			System.out.println("Error!! Please enter the correct Date");
			date = sc.nextInt();
		}

		return date;
	}

	// enter time in 24 hour "peak"&"normal" season
	public static void travelTime() {
		Scanner sc = new Scanner(System.in);
		double time;
		System.out.println("Enter the time using 24 hour clock notation");
		time = sc.nextDouble();

		if ((time >= 7.00 && time <= 9) || (time >= 16.00 && time <= 18.00)) {
			System.out.println("Peak Hours");
		} else {
			System.out.println("Normal hours");
		}

		while (time < 1.00 || time > 23.59) {
			System.out.println("Error! ::::::::: Please time using 24 hour clock notation");
			time = sc.nextDouble();
		}
	}

	// Menu
	public static int printMenu() {
		int userSelection;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\n1. Display charges under UBER");
		System.out.println("2. Display charges under DIDI");
		System.out.println("3. Display Charges under OLA");
		System.out.println("4. Show Report");
		System.out.println("5. Exit");
		printStars();
		userSelection = sc.nextInt();

		while (userSelection < 1 || userSelection > 5) {
			System.out.println("Error! ::::::::: Please Enter number 1 to 5 only");
			printMenu();
		}

		return userSelection;
	}

	// result
	public static double handleMenu(int userOption) {
		Scanner sc = new Scanner(System.in);
		double kms = kiloMeters();
		travelMonth();
		traveldate();
		travelTime();
		double charges1 = 1.15 * kms;
		double charges2 = 1.08 * kms;
		double charges3 = 1.35 * kms;

		switch (userOption) {
			case 1: {
				System.out.println("Your UBER fare is A$" + charges1);
				System.out.println("Thank you for using the system and good bye>>>>>>");
				break;
			}
	
			case 2: {
				System.out.println("Your DIDI fare is A$" + charges2);
				System.out.println("Thank you for using the system and good bye>>>>>>");
				break;
			}
	
			case 3: {
				System.out.println("Your OLA fare is A$" + charges3);
				System.out.println("Thank you for using the system and good bye>>>>>>");
				break;
			}
	
			case 4: {
				System.out.println("Report");
				System.out.println("Total fare for UBER is A$" + charges1);
				System.out.println("Total fare for DIDI is A$" + charges2);
				System.out.println("Total fare for OLA is A$" + charges3);
				System.out.println("Thank you for using the system and good bye>>>>>>");
				break;
			}
	
			case 5: {
				System.out.println("Thank you for using the system and good bye>>>>>> ");
				break;
			}
		}

		return charges1;
	}
}
