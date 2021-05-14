package assesment3;

import java.util.Scanner;
import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Assesment3 {
	// Year to use calculating is fixed at 2021 because of the below note.
	// Note: We will use these to find out if it is falling in weekend category or not and We will use 2021 as a default year.
	public static final int year = 2021;
	static String name; // added string name for Hello and Goodbye
	public static void main(String[] args) {
		welcomeMessage();
		printStars();
		int option = printMenu();
		handleMenu(option);
	}

	// enter the name before the welcome message
	public static void welcomeMessage() {
		Scanner sc = new Scanner(System.in);
		Date date = java.util.Calendar.getInstance().getTime();
		printStars();
		
		System.out.println("WELCOME TO RIDE-SHARING CHARGES ESTIMATOR AND COMPARISON SYSTEM\n");
		System.out.println("Developed by Koki, Ashmit, Saroj and Samuel Student IDs K200885 K210080 K210095 K210032");
		System.out.println("OODP101 Object Oriented Design and Programming");
		System.out.println(date + "\n");
	}

	// printing star line
	public static void printStars() {
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}

	
	public static void name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your name");
		name = sc.next();

	}

	
	// enter distance
	public static int kiloMeters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the travel distance in kilometers(KM) :");
		int kms = sc.nextInt();
		return kms;
	}

	// enter month
	public static int travelMonth() {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Month of travel in numbers, January > 1 and June > 6");
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
		System.out.println("Enter the date in number between 1 - 31");
		date = sc.nextInt();

		while (date < 1 || date > 31) {
			System.out.println("Error!! Please enter the correct Date");
			date = sc.nextInt();
		}

		return date;
	}

	// enter time in 24 hour "peak"&"normal" season
	public static double travelTime() {
		Scanner sc = new Scanner(System.in);
		double time;
		System.out.println("Now enter the time in 24 hour clock notation (7am for 7.00, 1pm for 13.00 or 9pm for 21.00) ");
		time = sc.nextDouble();

		while (time < 1.00 || time > 23.59) {
			System.out.println("Error! ::::::::: Please time using 24 hour clock notation");
			time = sc.nextDouble();
		}

		return time;
	}

	// calculate charges
	public static double calculateCharges(double kilometers, int month, int date, double time) {
		// Declaration and initialising.	
	    
		final double baseCharges = 5.50;
		final double distanceCharges = kilometers * 0.75;
		double peaktimeSurcharges = 0.0;
		double weekendSurcharges = 0.0;

		// Initialising.
		if (isPeakTime(time)) {
			peaktimeSurcharges = 2.50;
		}

		if (isWeekend(month, date)) {
			weekendSurcharges = 3.00;
		}

		// Calculate and return total charges.
		return baseCharges + distanceCharges + peaktimeSurcharges + weekendSurcharges;
	}
	
	
	

	public static void displayTravelDetails(String companyName, double charges, int month, int date, double time) {
		// Declaration and initialising.
		String dayOfWeekString = getDayOfWeekString(month, date);
		String monthString = getMonthString(month);

		// Display travel details.
		printStars();
		System.out.println();
		System.out.println("Your travel details:- Day of the Week on " + date + " of the month - " + monthString
				+ " is " + dayOfWeekString);
		if (isWeekend(month, date)) {
			System.out.println("Your day of travel falls under weekend category");
		} else {
			System.out.println("Your day of travel does not falls under weekend category");
		}
		System.out.println();
		if (isPeakTime(time)) {
			System.out.println("Time falls in peaktime category");
		} else {
			System.out.println("Time does not falls in peaktime category");
		}
		System.out.println();
		System.out.println("So charges will be applied accordingly");
		System.out.println();
		System.out.println("The final charges under " + companyName + " is: " + charges);
		printStars();
	}

	// Check if time is peak time.
	public static boolean isPeakTime(double time) {
		return (7.00 <= time && time <= 9.00) || (16.00 <= time && time <= 18.00);
	}

	// Check if day of week by month and date is weekend.
	public static boolean isWeekend(int month, int date) {
		int dayOfWeek = LocalDate.of(year, month, date).getDayOfWeek().getValue();

		return dayOfWeek == DayOfWeek.SATURDAY.getValue() || dayOfWeek == DayOfWeek.SUNDAY.getValue();
	}

	// Getting day of week string by month number and date number.
	public static String getDayOfWeekString(int month, int date) {
		return LocalDate.of(year, month, date).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault())
				.toUpperCase();
	}

	// Getting month string by month number.
	public static String getMonthString(int month) {
		return new DateFormatSymbols().getMonths()[month - 1].toUpperCase();
	}

	// Menu
	public static int printMenu() {
		int userSelection;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the following details as stated below:\n");
		System.out.println("1. Enter User Details");
		System.out.println("2. Display charges under UBER");
		System.out.println("3. Display charges under DIDI");
		System.out.println("4. Display Charges under OLA");
		System.out.println("5. Show Report");
		System.out.println("6. Exit");
		userSelection = sc.nextInt();

		while (userSelection < 1 || userSelection > 6) {
			System.out.println("Error! ::::::::: Please Enter number 1 to 6 only");
			printMenu();
		}

		return userSelection;
	}

	// result
	public static double handleMenu(int userOption) {
		Scanner sc = new Scanner(System.in);
		name();
		double kms = kiloMeters();
		int month = travelMonth();
		int date = traveldate();
		double time = travelTime();
		double charges1 = 1.15 * kms;
		double charges2 = 1.08 * kms;
		double charges3 = 1.35 * kms;

		switch (userOption) {
		case 1: {
			final double charges = calculateCharges(kms, month, date, time);
			displayTravelDetails("Your Uber fare is A$", charges, month, date, time);			
			break;
		}

		case 2: {
			final double charges = calculateCharges(kms, month, date, time);
			displayTravelDetails("Your DIDI fare is", charges, month, date, time);
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
			
			break;
		}
		case 6: {
			System.out.println("Thank you "+name+", for using our system and good bye>>>>>> ");
			break;
		}
		
		
		}

		return charges1;
	}
}
