import java.util.Scanner;

public class Four_problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		//Welcome Message
		System.out.println("Welcome to Flix Cinema!");
		System.out.println("Ticket Price may vary based your Age");
		System.out.println("Enjoy!");
		System.out.println("\n" + "-----------------------");
		
		//input
		System.out.print("\n" + "Enter your Age: ");
		int age  = input.nextInt();
	
		double AdultTicket = 7;
		double MovieTicket;
		
		//if statement
			if (age>60)
				MovieTicket = (AdultTicket*0.5);
			else if (age >3)
				MovieTicket = AdultTicket - (AdultTicket*0.3);
			else
				MovieTicket = AdultTicket - AdultTicket;
		
	System.out.print("Movie ticket price: " + MovieTicket +" RM" );
	
	}
}
