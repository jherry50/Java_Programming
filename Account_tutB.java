import java.util.Scanner;

public class Account_tutB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount ;	
		String account ;
	
Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Welcome to your account information  \n PLEASE CHOOSE YOUR ACCOUNT TYPE either A, B, C, D.  :");
		
		account = scanner.next();
		
		System.out.println("PLEASE ENTER THE THE AMOUNT ");
		
		amount = scanner.nextDouble();
		
		
		switch (account) {
		
		case "A" :
			
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 5% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ compute(1,amount,0.05));
			
			break;
			
		case "B" :
			
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 10% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ compute(1,amount,0.10));
			
			break;
			
		case "C" :
			
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 15% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ compute(1,amount,0.15));
			
			break;
			
		case "D" :
			
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 20% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ compute(1,amount,0.20));
			
			break;
			
		default :
			System.out.println("Customer, Please enter your details correctly  ");
		
		}
	
	
	
	}

	public  static double compute(int year, double amount, double rate){
		
		double Balance =( amount *(1+(rate * year))   );
		
		return Balance ;
		
		
	}
}
