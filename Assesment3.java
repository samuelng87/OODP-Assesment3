package assesment3;

import java.util.Scanner;

import java.text.SimpleDateFormat;  

import java.util.Date;  

public class Assesment3 {

	
	public static void main(String[] args) {
		
		
Scanner sc=new Scanner(System.in);
Date date=java.util.Calendar.getInstance().getTime();  


printStars();


System.out.println("\n\n WELCOME TO RIDE-SHARING CHARGES ESTIMATOR AND COMPARISON SYSTEM\n\n");
		
printStars();

		

System.out.print("\n\nDeveloped by Koki, Ashmit, Saroj and Samuel Student IDs add your id here K210032 \n"
		+ "OODP101 Object Oriented Design and Programming\n"
		+ date
		+ "\n\n");


printStars();




		
	}
	
	
	
	public static void printStars() {
		for(int i=0;i<100;i++) {
			System.out.print("*");
		}
		System.out.println();	

}
}



