package jherry;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// prompt use to enter number
		System.out.println("ENTER THE NUMBER");
		//store the entered value in variable num
		int num = scanner.nextInt();
		//the user defined function
		int factorial = fact(num);
		//out the result
		System.out.println("THE FACTORIAL OF " + num + "  is  " +factorial);
		
	}

	static int fact(int n)
	{
		int output;
		if (n==1 || n==0){
			output =1 ;
			}
		else{
	output = n * fact(n-1);
		}
		return output;
	}
}
