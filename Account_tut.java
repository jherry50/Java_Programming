import java.util.Scanner ;

public class Account_tut {
	
	public static void main (String[]args){
	double interest, amount  ;
	double Balance=0.00 ;
	
	String account ;
		final int year = 1;
		
		Scanner JOY = new Scanner(System.in) ;
		
		System.out.println("Welcome to your account information  \n PLEASE CHOOSE YOUR ACCOUNT TYPE either A, B, C, D.  :");
		
		account = JOY.next();
		
		System.out.println("PLEASE ENTER THE THE AMOUNT ");
		
		amount = JOY.nextDouble();
		
		
		switch (account) {
		
		case "A" :
			
			Balance =( amount *(1+(0.05 * 1))   );
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 5% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ Balance);
			
			break;
		case "B" :
			
			Balance =( amount *(1+(0.10 * 1))   );
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 10% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ Balance);
			
			break;
			
		case "C" :
			
			Balance =( amount *(1+(0.15 * 1))   );
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 15% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ Balance);
			
			break;
			
		case "D" :
			
			Balance =( amount *(1+(0.20 * 1))   );
			System.out.println("YOUR ACCOUNT TYPE IS " + account + "\nWITH 20% INTEREST RATE" );
			System.out.println("Customer, Your Balance is  "+ Balance);
			
			break;
			
			default :
				System.out.println("Customer, Please enter your details correctly  ");
			
			
			
			
		
		
		
		
		
		}
		
		

}
	
}
