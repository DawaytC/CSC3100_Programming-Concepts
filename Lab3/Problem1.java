import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your height in meter: ");
		double height = sc.nextDouble();
		System.out.print("Enter your weight in kilogram: ");
		double weight = sc.nextDouble();
		
		double bmi= weight/(height*height);
		bmi = Math.round(bmi);
		//System.out.println(name +", your BMI is: "+ bmi2);
		
		//Modified Code
		
		System.out.println("\n" + name + "," + "your height is " + height + " meters" + " and your weight is " + weight + " kg.");
		System.out.print("Your BMI is " + bmi + ", ");
		
		//Operators
		if (bmi >= 30)
			System.out.print("you are Obesity.");
		else if (bmi >= 25)
			System.out.print("you are Overweight.");
		else if (bmi >= 18.5)
			System.out.print("you are Normal.");
		else
			System.out.print("you are Underweight.");
		
	}
}
