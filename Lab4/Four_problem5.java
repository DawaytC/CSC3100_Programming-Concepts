import java.io.IOException;
import java.util.Scanner;

public class Four_problem5 {
	public static void main(String[] args) throws IOException {
	//Scanner input = new Scanner(System.in);
	
		System.out.print("Enter Product Number (1-5): ");

	
		char product = (char) System.in.read();
		double price = 0;
		
		switch (product) {
		case '1': price = 2.98;
		break;
		case '2': price = 4.50;
		break;
		case '3': price = 9.98;
		break;
		case '4': price = 4.49;
		break;
		case '5': price = 6.87;
		break;
		default: System.out.println("Try another product");
		}
		
		System.out.print("Price : " + price);
	}
}
