import java.util.Scanner;
public class Four_problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
		
	//Given Print
	System.out.println("Tariff Information Rate:");
	System.out.println("Domestic  Usage - 10" + "\n" + "Commercial = 11" + "\n" + "Government Department = 12" + "\n" + "Charitable Organisation = 13");
	System.out.println("\n" + "-----");
	
	int DomesticUsage = 10;
	int Commercial = 11;
	int GovernmentDepartment = 12;
	int CharitableOrganisation = 13;
	
	System.out.print("Enter Your Tariff Code: ");
	int Tariff  = input.nextInt();
	
	
	System.out.print("Enter Your Usage: ");
	double Usage = input.nextDouble();
	double UsageCost = 0;
	
	
	
	if (Tariff == 10) {
		if (Usage <= 20)
			UsageCost = Usage * 0.57;
		else if (Usage >= 21 && Usage <= 35)
			UsageCost = 20*0.57 + (Usage-20)*1.03;
		else if (Usage >= 35)
			UsageCost = 20*0.57 + 15*1.03 + (Usage-35)*2;
			if (UsageCost < 6)
				UsageCost = 6;
		else 
			UsageCost = UsageCost;
		}
	
	else if (Tariff == 11) {
		if (Usage == 35)
			UsageCost = Usage * 2.07;
		else if (Usage >= 35)
			UsageCost = 35*2.07 + (Usage-34)* 2.28;
			if (UsageCost < 36)
				UsageCost = 36;
		else 
			UsageCost = UsageCost;
			
		}
	
	else if (Tariff == 12) {
		if (Usage >= 0)
			UsageCost = Usage * 1.61;
			if (UsageCost < 17)
			UsageCost = 17;
		else
			UsageCost = UsageCost;
		}
	
	else if (Tariff == 13) {
		UsageCost = Usage * 0.58;
		if (UsageCost < 6)
			UsageCost = 6.00;
		else
			UsageCost = UsageCost;
		}
	
	else
		System.out.println("Not found");
		
	
	System.out.println("Total Payment: " + UsageCost + " RM" + "\n" + " ");
	
	//Ending Statement
	System.out.println("-----");
	System.out.print("Please proceed to counter for payment." + "\n" + "Thank You!");
	}
}
