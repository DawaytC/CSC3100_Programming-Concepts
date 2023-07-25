import java.util.Scanner;
public class LAB8_1 {
	public static void main(String[]args){
		
		int[]num = new int [10];
        int numLargest = 0;
        int count = 0;

        Scanner input  = new Scanner(System.in);
        
        //loop
        for(int i = 0; i<10 ; i++){
        System.out.print("Please Enter a number: ");
        num[i] = input.nextInt();
            		if(num[i] > numLargest){
            		numLargest = num[i];
            		count=1;
            		}
				       	else if(num[i] == numLargest){
				        count++;
				       	}   
        }
        
        //end of loop /output
        System.out.println("The number of occurence is: " + count);
        System.out.println("The largest number is: " + numLargest);
  }
}
