package jherry;
import java.util.Scanner;
public class CustAcct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer(30.00);
		Customer cust2= new Customer(-30.00);
		
		System.out.println("the initial balance for cust1 is  " + cust1.getBalance());
		System.out.println("the initial balance for cust2 is  " + cust2.getBalance());
		
		double depo1,depo2 ;
		Scanner input = new Scanner(System.in);
		System.out.println("for cust1 enter your deposit  " );
		depo1 = input.nextDouble();
		System.out.println("your deposit is   " + depo1);
		cust1.creditAcct(depo1);
		System.out.println("your new balance is   " + cust1.getBalance());

		
		System.out.println("for cust2 enter your deposit  " );
		depo2 = input.nextDouble();
		System.out.println("your withdrawal is   " + depo2);
		cust2.debitAcct(depo2);
		System.out.println("your new balance is   " + cust2.getBalance());
		

	}

}
