import java.util.Scanner;
public class LAB7_3 {
	public static void main(String[] args) {
	
		//intro
		display();
		
		//declaration
		int num = 1, age;
		char gov, room;
		double discount,price, days;
		double totalAmount;
		double summaryDetails;
		double amount = 1;
		String name;
		
		while (num!=0) {
			//details
			name = name();
			price = price(room());
			discount = discountComp(gov());
			days = days();
			summaryAgain(priceSummary(price, discount, days), name);
			num=loopNum();
			System.out.print("\n------------------ UPM Hotel -------------------");
		}
		
		
	}
	
	public static void display() {
		
		System.out.print("------------------ UPM Hotel -------------------");
		System.out.print("\n-- Welcome, Bem-vindo, Selamat Datang, Welkom --");
		
		System.out.print("\n\nRooms to Offer:");
		System.out.print("\nType [A]: Single Room - RM185/day");
		System.out.print("\nType [B]: Double Room - RM185/day");
		System.out.print("\nType [C]: Family Room - RM185/day");
		
		System.out.print("\n\n------------------ UPM Hotel -------------------");
	}
	
	public static String name() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter your Name: ");
		String name = input.nextLine();
		return name;
	}
	
	public static int age() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age = input.nextInt();
		return age;
		
	}
	
	public static char room() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Desired Room [A], [B], [C]: ");
		char room = input.next().charAt(0);
		return room;
	}
	
	public static double days() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Days: ");
		double days = input.nextDouble();
		return days;
	}
	
	public static char gov() {
		Scanner input = new Scanner(System.in);
		System.out.print("Are you a Government Servant? \n[Y] - Yes or [N] - No: ");
		char gov = input.next().charAt(0);
		return gov;
		
	}
	
	public static double price(char x) {
		int price;
			if (x=='A')
				price = 185;
				else if (x=='B')
					price = 210;
				else
					price = 285;
		return price;
	}
	
	public static double seniorDiscount(int x, double y) {
		double discount;
		if (x>60) 
			discount = 0.85;
		else 
			discount = y;
		return discount;
		
	}
	
	public static double discountComp(char x ) {
		double b;
				if (x=='Y') 
					b = 0.9;
				else 
					b = 1;
				
		int age = age();
		b = seniorDiscount(age, b);
		return b;
	}
	
	public static double priceSummary(double x, double y, double z) {
		double e = x * y * z;
		return e;
	}
	
	public static double summaryAgain(double a, String b) {
		System.out.println(String.format(b + ", Your bill price is RM" + "%.2f", a));
		return a;
	}
	
	public static int loopNum () {
		Scanner input = new Scanner(System.in);
		System.out.print("Press [1] to continue, Press [0] to stop: ");
		int num= input.nextInt();
		
		//break
		System.out.println();
		return num;
	}
}
