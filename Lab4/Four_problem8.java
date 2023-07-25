import java.util.Scanner;

public class Four_problem8 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double discount = 0;
		
		System.out.print("Items bought: ");
		double quantity = input.nextDouble();
		
		System.out.print("Accumulated Price(RM): ");
		double price = input.nextDouble();
		
		
		if (quantity>=1 && quantity<=9){
			if (price>=0.01 && price<=10.00) 
				discount=0;
			else if (price>=10.01 && price<=100.00)
				discount = price - (price*0.02);
			else 
				discount =  price - (price*0.05);
			}
		
		else if (quantity>=10 && quantity<=99) {
			if (price>=0.01 && price<=10.00) 
				discount = price - (price*0.05);
			else if (price>=10.01 && price<=100.00)
				discount = price - (price*0.07);
			else 
				discount= price - (price*0.09); 
			}
		
		else if (quantity>=100 && quantity<=499) {
			if (price>=0.01 && price<=10.00) 
				discount = price - (price*0.09);
			else if (price>=10.01 && price<=100.00)
				discount = price - (price*0.15);
			else 
				discount= price - (price*0.21); 
			}
		
		else if (quantity>=500 && quantity<=999) {
			if (price>=0.01 && price<=10.00) 
				discount = price - (price*0.14);
			else if (price>=10.01 && price<=100.00)
				discount = price - (price*0.23);
			else 
				discount= price - (price*0.32); 
			}
		
		else 
			if (price>=0.01 && price<=10.00) 
				discount = price - (price*0.21);
			else if (price>=10.01 && price<=100.00)
				discount = price - (price*0.32);
			else 
				discount= price - (price*0.43); 
		
	
		
		System.out.println("Total Amount: " + discount);
		
	}
}
