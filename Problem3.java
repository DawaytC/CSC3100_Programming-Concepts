/*
 * CODED BY TINNY DWIGHT BRIONES CUTAD
 * MATRIX NUMBER: 213748
 */

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("					        COMPUTER PROGRAMMING I");
		System.out.println("						       (CSC3100)");
		System.out.println("	*************************************MARKS EVALUATION APPLICATION**************************************");
		
		System.out.println("\nPLEASE ENTER MARKS: -");
		
		//input
			//FirstTest
			System.out.print("\nFIRST TEST: ");
			double FirstTest = input.nextDouble();
		
			//SecondTest
			System.out.print("\nSECOND TEST: ");
			double SecondTest = input.nextDouble();
			
			//Assignments1
			System.out.print("\nAssignment 1: ");
			double Assignments1 = input.nextDouble();
			
			//Assignments2
			System.out.print("Assignment 2: ");
			double Assignments2 = input.nextDouble();
			
			//Assignments3
			System.out.print("Assignment 3: ");
			double Assignments3 = input.nextDouble();
			
			//FinalExamination
			System.out.print("\nFinalExamination: ");
			double FinalExamination = input.nextDouble();
			
				//Calculated Marks
				System.out.println("					      CALCULATED MARKS");
				System.out.println(" ");
				
				//Print
				System.out.print("FIRST TEST	|	");
				System.out.print("SECOND TEST	|	");
				System.out.print("  A1  ");
				System.out.print("  A2  ");
				System.out.print("  A3  ");
				System.out.print("  ASSIGNMENT	     |	");
				System.out.print("  FINAL EXAMINATION	| ");
				System.out.println("TOTAL");
				
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				
						/*
						 * Rounded the computations to the nearest whole number
						 */
				
				
						//Computation FirstTest
						double FirstTestMark;
						
						FirstTestMark = (FirstTest/40)*.2*100;
						FirstTestMark = Math.round(FirstTestMark);
						
						System.out.print(FirstTest + " ");
						System.out.print("(" + FirstTestMark + "%" + ")" + "    |");
						
						//Computation SecondTest
						double SecondTestMark;

						SecondTestMark = (SecondTest/40)*.2*100;
						SecondTestMark = Math.round(SecondTestMark);
						
						System.out.print("      " + SecondTest + " ");
						System.out.print("(" + SecondTestMark + "%" + ")" + "     |");
						
						//Computation A1
						double AssignmentsTotal; //To compute the average scores of Assignments
						double AssignmentsMark;

						System.out.print("       " + Assignments1 + "  ");
						System.out.print(" " + Assignments2 + " ");
						System.out.print(" " + Assignments3);
						
						AssignmentsMark = (Assignments1 + Assignments2 + Assignments3 )/3 /50 * .3* 100;
						AssignmentsMark = Math.round(AssignmentsMark);
						
						AssignmentsTotal = (Assignments1 + Assignments2 + Assignments3 )/3;
						AssignmentsTotal = Math.round(AssignmentsTotal);
						
						System.out.print("   " + AssignmentsTotal+ " ");
						System.out.print("(" + AssignmentsMark + "%" + ")" + "     |");
						
						//Computation FinalExamination
						double FinalExaminationMark;

						FinalExaminationMark = (FinalExamination/80)*.3*100;
						FinalExaminationMark = Math.round(FinalExaminationMark);
						
						System.out.print("      " + FinalExamination + " ");
						System.out.print("(" + FinalExaminationMark + "%" + ")" + "        |");
						
						
						//Computation TotalMark
						double TotalMark;
						
						TotalMark = FirstTestMark+SecondTestMark+AssignmentsMark+ FinalExaminationMark;
						TotalMark = Math.round(TotalMark);
						System.out.print(" " + TotalMark + "%");
	}
}

