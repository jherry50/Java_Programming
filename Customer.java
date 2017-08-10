package jherry;

public class Customer {
	private double balance ;
	
	public Customer(double initBalance){
		if (initBalance > 0.0){
			balance = initBalance;
		}	
	}
	public void creditAcct (double ammount){
		 balance += ammount ;
		}
	public void debitAcct (double ammount){
		 balance -= ammount ;
	}
	public  double getBalance(){
		return balance ;
	}

}
