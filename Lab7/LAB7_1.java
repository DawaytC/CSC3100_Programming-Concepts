import java.util.Scanner;
public class LAB7_1 {
		public static int readNum() {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			return num;
		}
		
		
		public static int bigValue(int num1, int num2) {
			int bigValue = 0;
			if (num1 > num2)
				return num1;
			else 
				return num2;
			//return bigValue;
		}
		
		public static int sumvalues(int num1, int num2) {
			int sum = num1 +num2;
			return sum;
			
		}
		
		public static int average (int num1, int num2) {

			//int average = total/count;
			return num1/num2;
			
		}
		
		public static void main(String[] args) {
		//readNum();
			
			int maxValue =0;
			int total = 0;
			int average = 0;
			
			
			//loop
			while(true) {
				//int num = readNum();
				int count = 1;
				count++;
				int input = readNum();
				if (input==0) break;
				
				maxValue = bigValue(maxValue, input);
				total = sumvalues(total, input);
				average = average(total, count); 
			}
			

			//maxValue = bigValue(maxValue, num);
			System.out.println("Max Value: " + maxValue);
			System.out.println("Sum Value: " + total);
			System.out.println("Average: " + average);
		
		}
		
	}


