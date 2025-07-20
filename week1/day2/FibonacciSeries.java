package week1.day2;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
        System.out.print("enter the range for Fibonacci Series");
        int range =input.nextInt();
        
        int first =0,second=1;
        
        while(first<=range)
        {
        	System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        input.close();
	}

}
