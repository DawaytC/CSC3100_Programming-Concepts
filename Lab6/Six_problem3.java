import java.util.Scanner;
public class Six_problem3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int company = 0,num=1, count=0;
		int registrants = 0, company1 =  0, company2 = 0,  registrants2  =  0;
		int totalregistrants = 0;

		
		double averageregistrant = 0;
		
		double totalcharge = 0; //Individual charges
		double sumcharge =  0;  //End of total
		
		double charge1 = 450;
		double charge2 = 400;
		double charge3 = 250;
	
		
		//First Participant
		System.out.print("How many participants have registered?: ");
		registrants = input.nextInt();
		
		if (registrants >10) 
			totalcharge = registrants*charge3;
			else if (registrants >5) 
			totalcharge = registrants*charge2;
			else 
			totalcharge = registrants*charge1;
		
		company1 = (int) totalcharge;
		
		System.out.println("Registered participants: " + registrants); 
		System.out.println("Charge: " + company1);
		
		
		while (registrants2 != 0) {
			System.out.print("How many participants have registered to another company?: ");
			registrants2 = input.nextInt();
	
			if (registrants2 >10) 
				totalcharge = registrants2*charge3;
				else if (registrants >5) 
				totalcharge = registrants2*charge2;
				else 
				totalcharge = registrants2*charge1;
			company2 = (int) totalcharge;
			averageregistrant = averageregistrant + registrants2 + registrants;
		}
		
		System.out.println("Registered participants: " + registrants2); 
		System.out.println("Charge: " + company2);
		System.out.println();
		System.out.println("Total charge: " + company1);
		System.out.println("Total participants" + company1);
		

	}
}
