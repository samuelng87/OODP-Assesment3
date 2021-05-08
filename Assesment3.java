
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class Assesment3 {
   
    


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
		
                
		System.out.println("\n\nEnter your name:");
                String name = sc.nextLine();
                
               
		int option = printMenu();
                
		handleMenu(option);
                
                
		
	}

public static void printStars() {

	for(int i=0;i<100;i++) {
	 System.out.print("*");
			}
		
}

public static int kiloMeters(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n\nEnter the distance to travel:");
    int kms = sc.nextInt();
    return kms;
}
	

public static int printMenu() { 
	
	
	int userSelection;
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("\n\n1. Display charges under UBER");
	System.out.println("2. Display charges under DIDI");
	System.out.println("3. Display Charges under OLA");
	System.out.println("4. Show Report");
	System.out.println("5. Exit");
	userSelection=sc.nextInt();
	
	
		while(userSelection<1 || userSelection>5) {
			System.out.println("Error! ::::::::: Please Enter number 1 to 6 only");
			printMenu();
				}
			return userSelection;
                        
}

    
    public static double handleMenu(int userOption){
        Scanner sc=new Scanner(System.in);
        double kms=kiloMeters();
        double charges1=1.15*kms ;
        double charges2=1.08*kms ;
        double charges3=1.35*kms ; 
    switch(userOption){
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
                System.out.println("\n\nName:" );
                System.out.println("Total fare for UBER is A$" + charges1);
                System.out.println("Total fare for DIDI is A$" + charges2);
                System.out.println("Total fare for OLA is A$" + charges3);
                System.out.println("Thank you for using the system and good bye>>>>>>");
	}
	break;
	case 5: {
		
		System.out.println("Thank you for using the system and good bye>>>>>>");
	}
	}return charges1;
}

    
}	
	








	
