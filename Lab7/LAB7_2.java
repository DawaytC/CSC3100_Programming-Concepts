import java.util.Scanner;
public class LAB7_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declaration
		int tariff = 0;
		int usage = 0;
		int loopNum = 0;
		double UsageCost = 0;
		
		//input method
		tariff = inputTariff();
		usage = inputUsage();
		
			if (tariff==10) {
				UsageCost = t10(usage);				
			}	
			
			else if (tariff==11) {					
				UsageCost = t11(usage);				
			}		
			
			else if (tariff==12) {
				UsageCost = t12(usage);	
			}	
			
			else if (tariff==13){				
				UsageCost = t13(usage);	
			}
			
			else if (tariff<10 && tariff>13) {
				System.out.print("Not found");
			}	
			
			printInput(tariff,usage,UsageCost);
			loopNum=loopNum();
		
			while (loopNum!=0) {
				tariff = inputTariff();
				usage = inputUsage();
				
				if (tariff==10) {
					UsageCost = t10(usage);				
				}	
				
				else if (tariff==11) {					
					UsageCost = t11(usage);				
				}		
				
				else if (tariff==12) {
					UsageCost = t12(usage);	
				}	
				
				else if (tariff==13){				
					UsageCost = t13(usage);	
				}	
				
				else if (tariff<10 && tariff>13) {
					UsageCost = notFound();
				}
				
				printInput(tariff,usage,UsageCost);
				loopNum=loopNum();
				
			}
	}
	public static int inputTariff () {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your tariff code: ");
		int tariff= input.nextInt();
		return tariff;
	}
	
	public static int inputUsage () {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your Usage code: ");
		int usage= input.nextInt();
		return usage;
	}
	
	public static double notFound() {
		System.out.print("Not Found");
		return 0;
	}
	
	
	public static int Tariff() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Tariff Code: ");
		int tariff = input.nextInt();
		return Tariff();
		
	}
	
	public static int Usage() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Usage: ");
		double usage = input.nextDouble();
		return Usage();
		
	}
	
	public static int statementLoop() {
		Scanner input = new Scanner(System.in);
		System.out.print("Press [1] to continue, Press [0] to stop.");
		int a= input.nextInt();
		System.out.println("\n\n");
		return a;
	}
	
	public static double t10 (int y) {
		double Usage = 0;
		double UsageCost = 0;
		
		//if (y == 10) 
			if (y <= 20)
				UsageCost = (y * 0.57);
			else if (y >= 21 && y <= 35)
				UsageCost =  (20*0.57 + (y-20)*1.03);
			else if (y >= 35)
				UsageCost = (20*0.57 + 15*1.03 + (y-35)*2);
				if (UsageCost < 6)
					UsageCost = 6;
			else 
				UsageCost = UsageCost;
				return UsageCost;
		
	}
	
	public static double t11(int y) {
		double Usage = 0;
		double UsageCost = 0;
		
		//else if (Tariff == 11) 
			if (y == 35)
				UsageCost = (int) (y * 2.07);
			else if (y >= 35)
				UsageCost = (int) (35*2.07 + (y-34)* 2.28);
				if (UsageCost < 36)
					UsageCost = 36;
			else 
				UsageCost = UsageCost;
		return UsageCost;
	}
	
	public static double t12(int y) {
		double Usage = 0;
		double UsageCost = 0;
		
		//else if (Tariff == 12) {
			if (y >= 0)
				UsageCost = (y * 1.61);
				if (UsageCost < 17)
				UsageCost = 17;
			else
				UsageCost = UsageCost;
		return UsageCost;
	}
	
	public static double t13 (int y) {
		double Usage = 0;
		double UsageCost = 0;
		//else if (Tariff == 13) {
			UsageCost = (y * 0.58);
			if (UsageCost < 6)
				UsageCost =  6.00;
			else
				UsageCost = UsageCost;
			return UsageCost;
	}
	
	public static void printInput (int x,int y,double z) {

	System.out.println("--");
	System.out.println("Tariff Code: " + x + "\nUsage Cost: " + y + "\nBill to Pay (RM): " + z);
	System.out.println("--");
	}
	
	public static int loopNum () {
		Scanner input = new Scanner(System.in);
		System.out.print("Press [1] to continue, Press [0] to stop: ");
		int num= input.nextInt();
		
		//break
		System.out.println();
		
		return num;
	}}
	