import java.util.Scanner;

public class Four_problem7 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your Grade in Bahasa Malaysia: ");
		String GradeBahasa = input.next();
		
		System.out.print("Enter your Grade in English: ");
		String GradeEnglish = input.next();
		
		System.out.print("Enter your Grade in Mathematics: ");
		String GradeMathematics = input.next();
		
		System.out.print("Enter your Grade in Science: ");
		String GradeScience = input.next();
		
		System.out.print("Enter your Grade in Geography: ");
		String GradeGeography = input.next();
		
		System.out.print("Enter your Grade in History: ");
		String GradeHistory = input.next();
		
		System.out.print("Enter your Grade in Life Skills: ");
		String GradeLifeSkills = input.next();
		
		
		int totalcount = GradeBahasa.length() + GradeEnglish.length() +
			GradeMathematics.length() + GradeScience.length() +
			GradeGeography.length() + GradeHistory.length() + 
			GradeLifeSkills.length()
			;
		
		int totalcount_afterRemove = GradeBahasa.replace("A", "").length() +
			GradeEnglish.replace("A", "").length() + GradeMathematics.replace("A", "").length() +
			GradeScience.replace("A", "").length() + GradeGeography.replace("A", "").length() +
			GradeHistory.replace("A", "").length() + GradeLifeSkills.replace("A", "").length() 
			;
		
		int count = totalcount-totalcount_afterRemove;
	
		System.out.println("\n" + "------" + "\n" + "A's you have: " + count);
	
		if (count >= 5) {
			if ( GradeMathematics.equals ("A") ) 
				if ( GradeScience.equals("A") || GradeEnglish.equals ("A")) 
				  System.out.println("\n" + "------" + "\n" + "You are eligible to apply for FORM 4 Science Stream Class");
				else 
				  System.out.println("\n" + "------" + "\n" + "You need to have A in Science or English to be eligible");
			else
				System.out.println("\n" + "------" + "\n" + "You need to have A in Math");
		}
		
		else
			System.out.println("\n" + "------" + "\n" + "You need to have 5 A's or more");
		
	}
}

