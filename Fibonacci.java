package jherry;

import java.util.Scanner;

public class Fibonacci {

	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		// prompt use to enter number
		System.out.println("ENTER THE NUMBER YOU WISH  TO CALCULATE TO");
		//store the entered value in variable num
		int num = scanner.nextInt();
		//the user defined function
		int fibonacci= fibo(num);
		//out the result
		System.out.println("THE Fibonacci OF " + num + "  is  " +fibonacci);	
	}
	public static int fibo(int num){
		if (num==1 || num==2){
			return 1;
		}
		return fibo(num-1)+fibo(num-2);
	} 
	
}
