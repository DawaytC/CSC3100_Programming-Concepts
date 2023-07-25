import java.util.Scanner;
public class problem2 {
public static final int passwordlength = 6;
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String passworddata = input.nextLine();

        if (is_Valid_Password(passworddata)) {
            System.out.println("Password is valid: " + passworddata);
        } else {
            System.out.println("Not a valid password: " + passworddata);
        }

    	}
		public static boolean is_Valid_Password(String password) {
    	int charCount = 0;
        int numCount = 0;
        if (password.length() < passwordlength) return false;
        	for (int i = 0; i < password.length(); i++) {
        	char ch = password.charAt(i);
        		if (is_Numeric(ch)) numCount++;
            		else if (is_Letter(ch)) charCount++;
            	else return false;
        		}
        return (charCount >= 2 && numCount >= 2);
		}
		
		public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
		}
		
		public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
		}

}
