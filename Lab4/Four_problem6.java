import java.util.Scanner;

public class Four_problem6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Please Enter your Gender: ");
		String response1 = input.next();
		
		System.out.print("Please Enter your Age: ");
		int response2 = input.nextInt();
		
		if (response1.equals ("male") || response1.equals ("Male") && response2 >= 18 && response2 <= 30) 
			System.out.println("You are qualified!");
		else
			System.out.println("You are not qualified!"); 
		
	}
}