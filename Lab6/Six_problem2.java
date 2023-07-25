import java.util.Scanner;
public class Six_problem2 {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	  
		System.out.print("Enter an integer: ");
		double number = input.nextInt();
		
		double max = number;
		double mean = 0;
		double total = number;
		double count = 0;
		
		while (number != 0) {
			count++;
			System.out.print("Enter another integer: ");
			number = input.nextInt();
			
			if (number > max) {
				max = number;
				total = total + number;
			}
		}
	mean = total/count;
	System.out.println("\nMax number: " + max);
	System.out.println("Total: " + total);
	System.out.println("Average: " + mean);
	
	}
	
}
