import java.util.Scanner;
public class Six_problem5 {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	int firstnum = 0;
	int secondnum = 1;

	System.out.print("Enter the number of terms: ");
	int number = input.nextInt();

		//loop
	    while (firstnum <= number) {
	      System.out.print(firstnum + ", ");
	      
	      int nextnum = firstnum + secondnum;
	      firstnum = secondnum;
	      secondnum = nextnum;
	      
	    }
	}
}
