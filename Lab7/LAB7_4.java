import java.util.Scanner;
public class LAB7_4 {
private static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double grossPay, netPay;
	
	int num = 1;
	while (num!=0) {
		hours();
		payRate();
		deduction();
		
		grossPay = grossPay(hours(),payRate());
		netPay = netPay(grossPay,deduction());
		
		summary(grossPay, deduction(), netPay);
		num = loopNum();
		
	}
	
}

public static int hours() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Hours Worked: ");
	int hours= input.nextInt();		
	return hours;
}

public static int payRate() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Pay Rate: ");
	int payRate= input.nextInt();
	return payRate;
}

public static double deduction() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter deductions: ");
	double deduc = input.nextInt();		
	return deduc;
}

public static double grossPay(int x, int y) {
	double z = x*y;
	return z;
}

public static double netPay(double grossPay, double d) {
	double z = grossPay-d;
	return z;
}

public static void summary (double x, double y, double z) {
	System.out.println("\nTotal Gross Pay: RM" + x);
   System.out.println("Total Deductions: RM" + y);
   System.out.println("Total Net Pay: RM" + z);
}

public static int loopNum () {
	Scanner input = new Scanner(System.in);
	System.out.print("Press [1] to continue, Press [0] to stop: ");
	int num= input.nextInt();
	System.out.println();
	
	return num;
}

}
