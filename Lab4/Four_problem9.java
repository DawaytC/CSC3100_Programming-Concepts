import java.io.IOException;

import java.util.Scanner;
public class Four_problem9 {
	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner (System.in);
	
		System.out.print("Are you a Government Servant?: ");
		String CustomerGS = input.next();
		
		System.out.print("Enter your Age: ");
		double CustomerAge = input.nextDouble();
	
		double discount = 0;
	
		System.out.println("\n" + "Available Rooms and Price:");
		System.out.println("Type A: Single Room - RM185/day");
		System.out.println("Type B: Double Room - RM210/day");
		System.out.println("Type C: Double Room - RM285/day");

		System.out.print("\n" + "Please select your type of room (A,B,C): ");
		char rooms = (char) System.in.read();
		double price = 0;
		
		switch (rooms) {
		case 'A': price = 185;
		break;
		case 'B': price = 210;
		break;
		case 'C': price = 285;
		break;
		default: System.out.println("error!");
		}
		
		System.out.print("How many days are you staying?: ");
		double nights = input.nextDouble();
		double nightcomputations = nights*price;
		
		
		//
		System.out.println("Total Price: " + "RM" + nightcomputations);
		

		
		if (CustomerGS.equals ("Yes") || CustomerGS.equals ("yes")) {
				discount = nightcomputations - (nightcomputations * 0.10);
				System.out.print("------");
				System.out.println("\n" + "With Discount (10%): " + "RM" + discount);
				
				
		}
		
		else if (CustomerAge > 60) {
			
			discount = nightcomputations -  (nightcomputations * 0.15);
			System.out.print("------");
			System.out.println("\n" + "With Discount (15%): " + "RM" + discount);
			
		}
		else
		System.out.println("Thank you for booking!");
	}
}
