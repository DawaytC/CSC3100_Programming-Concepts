import java.util.Scanner;
public class LAB8_2 {
	
	public static void main(String[]args){
		int [] age = new int [10];
		String [] name = new String [10];
		readName(name, age);
		youngestMember(name, age);
		oldestMember(name, age);
		averageAge(age);
	}
	public static void readName(String [] name, int[] age) {
		Scanner input= new Scanner(System.in);
		for(int i=0;i<10;i++)
		 {
			 System.out.print("Please enter name "+(1+i)+" : ");
			    name[i] = input.nextLine();
			    readAge(i, age);
		 }
	}
	public static void readAge(int i,int[] age) {
		Scanner input = new Scanner(System.in);
			 System.out.print("Please enter age "+(1+i)+" : ");
			    age[i] = input.nextInt();
			    System.out.println("-- ");
		 }
	public static void youngestMember(String [] name, int [] age){
		int lowest = age[0];
		int index = age[0];
		String youngest = name[0];
		
		for(int i=0;i<10;i++) 
		 {
			 if(age[i]<lowest) {
				 lowest=age[i];
			 	 index=i;
			 	 youngest = name[i];
			 	}
			 else 
				 lowest = lowest;
		 }
		System.out.println("\nThe youngest member is "+ youngest);
		System.out.println("The age of the youngest member is "+ lowest);
	}
	public static void oldestMember(String [] name, int [] age){
		int highest = age[0];
		int index= age[0];
		String oldest= name[0];
		
		for(int i=0;i<10;i++) 
		 {
			 if(age[i]>highest) {
				 highest=age[i];
			 	 index=i;
			 	 oldest = name[i];
			 	}
			 else 
				 highest=highest;
		 }
	
		System.out.println("\nThe oldest member is "+ oldest);
		
		System.out.println("The age of the oldest member is "+ highest);
	}
	public static void averageAge(int [] age) {
		double total=0;
		double k=0;
		for(int i=0;i<10;i++)
		 {
			total=total+age[i];
			k=i+1;
		 }
		double avg=total/k;
		System.out.println("\nThe average age is "+ String.format("%.2f",avg));
	}	
}
