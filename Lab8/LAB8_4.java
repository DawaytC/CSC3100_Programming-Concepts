import java.util.Scanner;
public class LAB8_4 {
	public static void main(String[] args) {
		System.out.print("Enter number of students: ");
		int indexStudent=readInt();
		int[] studData = new int[5];
		String[][] records=studentRecord(indexStudent,studData);
		int[] gradeCount=countGrades(records);
		printRecords(records, gradeCount, indexStudent);
	}
	
	public static int readInt() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}
	
	public static String readString() {
		Scanner input = new Scanner(System.in);
		String string = input.next();
		return string;
	}
	
	public static char readChar() {
		Scanner input1 = new Scanner(System.in);
		String text = input1.next();
		char input = text.charAt(0);
		return input;
	}
	
	public static String grade(double sum) {
		String grade = "";
		if(sum<=39) {grade="F";}
		else
			if(sum>=40 && sum<=44 ) {grade="D";}
				else
			if(sum>=45 && sum<=49 ) {grade="D+";}
				else
			if(sum>=50 && sum<=54 ) {grade="C";}
				else
			if(sum>=55 && sum<=59 ) {grade="C+";}
				else
			if(sum>=60 && sum<=64 ) {grade="B-";}
				else
			if(sum>=65 && sum<=69 ){grade="B";}
				else
			if(sum>=70 && sum<=74) {grade="B+";}
				else
			if(sum>=75 &&sum<=84 ) {grade="A-";}
				else grade="A";
		 return grade;
	}
	
	public static String[][] studentRecord(int indexStudent, int[] list){
		String[][] studRecord=new String[indexStudent][7];
		int count = 0;
		while(count<indexStudent) {
		
			for(int i=0;i<studRecord.length;i++) {
			int sum=0;
			for(int k=0;k<list.length;k++) {
				if(k==0)
					{System.out.print("Enter the student matric number: ");
					list[k]=readInt();continue;}
				if(k==3)
					{System.out.print("Enter the percentage for assignments: ");
					list[k]=readInt();continue;}
				if(k==4)
					{System.out.print("Enter the percentage for final exam: ");
					list[k]=readInt();continue;}
				if(k>0)
					{System.out.print("Enter the percentage for Test " + k + ": ");
					list[k]=readInt();continue;}	
		}
			
			for(int j=0;j<studRecord[i].length;j++) {
				if(j<5)
					{studRecord[i][j]=Integer.toString(list[j]);continue;}
				if(j==5) {
					for(int k=1;k<list.length;k++) {	
					sum+=list[k];
					}
					   
					studRecord[i][j]=Integer.toString(sum);
					continue;
				}
				if(j==6) {studRecord[i][j]=grade(sum); continue;}
			}
			count++;
			System.out.println();
		}
	}
		return studRecord;
	}
	
	public static int[] countGrades(String[][] records) {
		int[] list= {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<records.length;i++) {
			if(records[i][6].equalsIgnoreCase("A"))
				{list[0]++; continue;}
			if(records[i][6].equalsIgnoreCase("A-"))
				{list[1]++;continue;}
			if(records[i][6].equalsIgnoreCase("B+"))
				{list[2]++;continue;}
			if(records[i][6].equalsIgnoreCase("B"))
				{list[3]++;continue;}
			if(records[i][6].equalsIgnoreCase("B-"))
				{list[4]++;continue;}
			if(records[i][6].equalsIgnoreCase("C+"))
				{list[5]++;continue;}
			if(records[i][6].equalsIgnoreCase("C"))
				{list[6]++;continue;}
			if(records[i][6].equalsIgnoreCase("D+"))
				{list[7]++;continue;}
			if(records[i][6].equalsIgnoreCase("D"))
				{list[8]++;continue;}
			if(records[i][6].equalsIgnoreCase("F"))
				{list[9]++;continue;}	
		}
		return list;
	}
	
	public static double toDouble(int num) {
		double number = num;
		return number;
	}
	
	public static void printRecords(String[][] records, int[] list, int indexStudent) {
		System.out.println("--");
		System.out.println("REPORT"+"\n");
		for(int i=0;i<records.length;i++) {
		System.out.print("Matric: "+records[i][0]+"\n");
		System.out.print("Test 1%: "+records[i][1]+"\n");
		System.out.print("Test 2%: "+records[i][2]+"\n");
		System.out.print("Assignments%: "+records[i][3]+"\n");
		System.out.print("Final Exam%: "+records[i][4]+"\n");
		System.out.print("Total%: "+records[i][5]+"\n");
		System.out.print("Grade: "+records[i][6]+"\n");
		System.out.println();
		}
		
		System.out.println("-- Calculations --"+"\n");
		
		System.out.print("Grade A:" + list[0] + " students" + ", " +
				toDouble(((list[0]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("Grade A-:" + list[1] + " students" +  ", " +
				toDouble(((list[1]/indexStudent)*100))+ "%" +"\n");
		
		System.out.print("Grade B+:" + list[2] + " students" + ", " +
				toDouble(((list[2]/indexStudent)*100))+ "%" +"\n");
		
		System.out.print("Grade B:" + list[3] + " students" + ", " +
				toDouble(((list[3]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("Grade B-:" + list[4] + " students" + ", " +
				toDouble(((list[4]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("Grade C+:" + list[5] + " students" + ", " +
				toDouble(((list[5]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("Grade C:" + list[6] + " students" + ", " +
				toDouble(((list[6]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("Grade D+:" + list[7] + " students" + ", " +
				toDouble(((list[7]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("Grade D:" + list[8] + " students" + ", " +
				toDouble(((list[8]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("Grade F:" + list[9] + " students" + ", " +
				toDouble(((list[9]/indexStudent)*100)) + "%" +"\n");
		
		System.out.print("");
		System.out.print("--");
	}
}
