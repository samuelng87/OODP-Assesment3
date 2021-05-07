package assesment3;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class testing {


	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Date date=java.util.Calendar.getInstance().getTime();  


		
		
		
		
		printStars();


		System.out.println("\n\n\n"
				+ "WELCOME TO RIDE-SHARING CHARGES ESTIMATOR AND COMPARISON SYSTEM"
				+ "\n\n");
			
		printStars();


		System.out.print("\n\nDeveloped by Koki, Ashmit, Saroj and Samuel Student IDs add your id here K210032 \n"
			+ "OODP101 Object Oriented Design and Programming\n"
			+ date
			+ "\n\n\n");


		printStars();
		
		
		int option = printMenu();
		handleMenu(option);
		
	}

public static void printStars() {

	for(int i=0;i<100;i++) {
	 System.out.print("*");
			}
		
}
	

public static int printMenu() { 
	
	
	int userSelection;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("\n\n1. Enter usage details");
	System.out.println("2. Display charges under UBER");
	System.out.println("3. Display charges under DIDI");
	System.out.println("4. Display Charges under OLA");
	System.out.println("5. Show Report");
	System.out.println("6. Exit");
	userSelection=sc.nextInt();
	
	
		while(userSelection<1||userSelection>6) {
			System.out.println("Error! ::::::::: Please Enter number 1 to 6 only");
			printMenu();
				}
			return userSelection;
}



public static double handleMenu(int userOption) {
	Scanner sc=new Scanner(System.in);
	double charges=0;
	double kms=1;
	switch (userOption) {
	case 1: 
	{
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter the approximate Kms");
		kms=sc.nextDouble();
	}
	break;
	case 2: {
		
		charges= kms*1.15;
		System.out.println("Your UBER fare is A$" + charges);
	}
	break;
	case 3: {
		
		charges= kms*1.08;
		System.out.println("Your DIDI fare is A$" + charges);
	}
	break;
	case 4: {
		
		charges= kms*1.35;
		System.out.println("Your OLA fare is A$" + charges);
	}
	break;
	case 5: {
		
		System.out.println("Report");
	}
	break;
	case 6: {
		
		System.out.println("Thank you for using the system and good bye>>>>>>");
	}
	}
	
	return charges;
	
}







	
}