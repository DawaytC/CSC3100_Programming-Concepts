import java.util.Scanner;
public class LAB8_3 {
public static void main(String[] args) {
	
		System.out.println("** Multiple-Choice Test Checking **" + "\n");
		System.out.print("Enter how many students: ");
		int indexStudent = readInt();
		
		System.out.print("Enter how many questions: ");
		int indexQuestion = readInt();
		
		System.out.println("\n"+"Key to the Questions:");
	
		int[] matricNum = new int[indexStudent];
		String[] studRecord = new String[7];

		char[] keyList = keyList(indexQuestion);
		char[][] matrix=readStudentAnswers(indexStudent, indexQuestion, matricNum);
		int[] answerList=answerCounter(keyList, matrix, indexStudent, indexQuestion);
		
		printReport(answerList,keyList,matricNum);
		
}
	public static int readInt() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}
	public static String readText() {
		Scanner input = new Scanner(System.in);
		String text = input.next();
		return text;
	}
	public static char readChar() {
		Scanner input = new Scanner(System.in);
		String text = input.next();
		char input1 = text.charAt(0);
		return input1;
	}
	public static char[] keyList(int indexQuestion) {
		
		char[] keyList=new char[indexQuestion];
		for(int i=0;i<((keyList.length));i++) {
			System.out.print("Enter the correct answer to "+(i+1)+": ");
			keyList[i] = readChar();
		}
		return keyList;
	}
	public static char[][] readStudentAnswers(int indexStudent, int indexQuestion, int[] list) {
		
		char[][] matrix=new char[indexStudent][indexQuestion];
		for(int i=0;i<matrix.length;i++) {
			System.out.print("\n" + "--" + "\n" + "Enter student matrix number: ");
			list[i]=readInt();
			System.out.print(list[i]+" Answers: ");
			for(int j=0;j<(matrix[i].length);j++) {
				System.out.print("\n" + "Enter the answer to "+(j+1)+": "); matrix[i][j]=readChar();
			}
		}
		return matrix;
	}

	public static int[] createIntArr(int index) {
		int[] list=new int[index];
		return list;
	}
	public static int charCompare(char a, char b) {
		String text = String.valueOf(a);
		String text1 = String.valueOf(b);
		if(text.equalsIgnoreCase(text1)) {return 1;} 
		else return 0;
	}
	public static double AverageCalc(int answerCount, char[] keyList) {
		
		double total=keyList.length;
		return Math.round((answerCount/total)*100);
	}
	public static int[] answerCounter(char[] keyList, char[][] matrix, int indexStudent, int indexQuestion) {
		
		int[] answerList=new int[indexStudent];
		for(int i=0;i<matrix.length;i++) {
			int countPerStudent=0;
			for(int j=0;j<matrix[i].length;j++) {
				char charOne=matrix[i][j]; 
				char charTwo=keyList[(j)]; 
				if(charCompare(charOne, charTwo)==1) {countPerStudent++;}
				}
			answerList[i]=countPerStudent;
		}
		return answerList;
	}	

	public static void printMatrix(char[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			System.out.print("Student "+i+":");
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(" "+matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void printReport(int[] list, char[] keyList, int[] matric) {
		System.out.println("\n" + "** Report  **");
		for(int i=0;i<list.length;i++)
			System.out.println("\n"+"Matrix No.: " + matric[i] + "\n"+ "Correct answers: " + list[i] +"\n"+ "Average: "+AverageCalc(list[i], keyList)+"%.");
	}
	
}