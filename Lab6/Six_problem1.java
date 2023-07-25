import java.util.Scanner;
public class Six_problem1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double product1 = 2.98;
	double product2 = 4.50;
	double product3 = 9.98;
	double product4 = 4.49;
	double product5 = 6.87;
	double sumproducts = 0;
	double producttotal = 0;
	
	
	System.out.print("Enter a product of number from 1 to 5: ");
	int product = input.nextInt();
	
	
	
	
	//loop
	while (product >0 && product<6) {
		
		System.out.print("Enter quantity: ");
		int quantity = input.nextInt();
		
		switch (product) {
		case 1: 
			producttotal = product1*quantity;
			System.out.println("Product Price: " + producttotal + "\n");
		break;
		
		case 2: 
			producttotal = product2*quantity;
			System.out.println("Product Price: " + producttotal + "\n");
		break;
		
		case 3:
			producttotal = product3*quantity;
			System.out.println("Product Price: " + producttotal + "\n");
		break;
		
		case 4:
			producttotal = product4*quantity;
			System.out.println("Product Price: " + producttotal + "\n");
		break;
		
		case 5: 
			producttotal = product5*quantity;
			System.out.println("Product Price: " + producttotal + "\n");
		break;
		
		default: System.out.println("Try another product");
		}	
		
		sumproducts += producttotal;
		
		System.out.print("Enter a product of number from 1 to 5: ");
		product = input.nextInt();

			
		
		
		
	}
	
	System.out.println("----" + "\n" + "Total Price: " + sumproducts + "RM");
		}
	}

