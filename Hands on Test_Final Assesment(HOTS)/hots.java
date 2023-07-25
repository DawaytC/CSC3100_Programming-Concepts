import java.util.Scanner;
public class hots {
public static void main(String[] args) {

	double houseCategory = 0;
	double displayMessage;
	
	double floorArea = readArea(); 
	double price = readPrice();
	
	houseCategory = calcProperty(floorArea, price);
	displayMessage = propertyCategory(houseCategory);
	
	//System.out.println(displayMessage);
	System.out.println("Property Price: "+ houseCategory);
	
	
}

public static double calcProperty(double x, double y) {
	double propertyPrice = x * y;
	return propertyPrice;
}

public static double readArea() {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter Area (Sq ft): ");
	double area = input.nextDouble();
	return area;
}

public static double readPrice() {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter Price (Sq ft): ");
	double price= input.nextDouble();
	return price;
}

public static double propertyCategory(double houseCategory) {
	String a = "RMB A - Residensi Wilayah";
	String b = "RMB B - MyHome";
	String c = "RMB C - My First Home";
	
	double x;
	x = 0;
	if (x < 180000) 
		System.out.println("\nHouse Category: " + a);
	else if (x == 180000 && x <= 450000)
		System.out.println("\nHouse Category: " + b);
	
	else if (x > 450000)
		System.out.println("\nHouse Category: " + c);
	else 
		System.out.println("\nno data");
	return x;
	
}

}
