import java.util.Scanner;
public class problem3 {

public static int count(String s1, char a) {
	 int count = 0;
	 for (int i = 0; i < s1.length(); i++) {

	 if (s1.charAt(i) == a) count++;
	 } return count;
}
			public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a string: ");
	        
			String character = input.nextLine();
			System.out.print("Please enter a character: ");
	        
			char ch = input.next().charAt(0);
			System.out.println("The number of time the character \'" + ch +"\' appears in the String variable s1 is " + count(character,ch) + ".");
			
			}

}

