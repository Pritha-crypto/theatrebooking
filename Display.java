package com.TheatreBooking;
import java.util.Scanner;


public class Display {


	public static void main(String[] args) {
		System.out.println("Level 1 - Login task");
		// input - mobile no
		System.out.println("Enter the mobileNo:");
		Scanner S = new Scanner(System.in);
		Long mobileNo = S.nextLong();
		System.out.println("Enter the valid length of mobileNo:");
		int length_mbe = S.nextInt();
		// input - password
		System.out.println("Enter the password:");
		String pwd = S.next();
		System.out.println("Enter the valid length of password:");
		int length_pwd = S.nextInt();
		 

	//output
//Level 1
	
	if(Mbe_pwd_Check.checkmobileNo(mobileNo,length_mbe)==true && Mbe_pwd_Check.checkLength(pwd,length_pwd)== true) {
		System.out.println("Successfully logged in");	
	}
	else{
		System.out.println("Incorrect mobile No or password");
		System.exit(0);
	}
	


	
//Level 2	
	 System.out.println("LEVEL 2 - Display cabtypes task");
	 Seattype.seatType();
	 
//Level 3
	 // Part 1 - seatchoice validation
	 System.out.println("LEVEL 3");
	 System.out.println("Enter the seatChoice:");
	 String seatChoice = S.next();
	 if(FareCalculation.checkCorrectseat(seatChoice)==true) {
			System.out.println("you choosed " + seatChoice);
		}
		else {
			System.out.println("Invalid seattype"); ;
			System.exit(0); //Tell whether the entered cab is valid or not //
		}
	 
	 
	 // Part 2 - tickfare calculation
	 
	 System.out.println("Enter the number of seats you need:");
	 int seat = S.nextInt();
	 FareCalculation.ticketfare(seatChoice,seat);
	 FareCalculation f = new FareCalculation();
	 System.out.println("Your fare for "+seatChoice+"is "+ f.fare +" rs." );
	 
	 // Part 3 - ticfare with gst
	 
	 FareCalculation.Gst();
	 System.out.println("Your total fare with GST:");
	 System.out.println(f.fare_gst+" rs");
	 System.out.println("Thank you, Happy Watching!");

	 S.close();
	 
	 
	}
}
