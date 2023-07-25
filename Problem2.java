/*
 * CODED BY TINNY DWIGHT BRIONES CUTAD
 * MATRIX NUMBER: 213748
 */

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
	//Item1
	System.out.print("Item 1: ");
	String Name1 = input.nextLine(); 
	
	System.out.print("Quantity: ");
	double Quantity1 = (double) input.nextDouble(); 
	
	System.out.print("Unit Price: ");
	double UnitPrice1 = (double) input.nextDouble(); 
	
	//Processing Item 1
	double Amount1;
	Amount1 = Quantity1*UnitPrice1;
	System.out.println("Amount: " + Amount1);
	System.out.println("---------------------");
	
	
	
			//Item 2
			System.out.print("Item 2: ");
			String Name2 = input.next(); 

			System.out.print("Quantity: ");
			double Quantity2 = input.nextDouble(); 

			System.out.print("Unit Price: ");
			double UnitPrice2 = input.nextDouble(); 

			//Processing Item 2
			double Amount2;
			Amount2 = Quantity2 * UnitPrice2;
			System.out.println("Amount: " + Amount2);

	
					//Subtotal
					double Subtotal;
					Subtotal = Amount1 + Amount2;
					System.out.println("\nSubtotal: " + Subtotal);
	
					//Service Charge
					double ServiceCharge;
					double ChargePercentage = 0.1;
					ServiceCharge = Subtotal * ChargePercentage;
					
					ServiceCharge = Math.round(ServiceCharge * 100.0) / 100.0;
					System.out.println("ServiceCharge (10%): " + ServiceCharge);
	
					//Total
					double Total;
					Total = ServiceCharge+Subtotal;
					System.out.println("\nTotal: " + Total);
	}

}
