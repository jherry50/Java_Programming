package jherry;

public class BicycleRegistration {
	 public static void main( String[] args ) {
		    
	        Bicycle bike1, bike2, bike3;
	        String  owner1, owner2, owner3;
	        
	        bike1 = new Bicycle( );     //Create and assign values to bike1
	        bike1.setOwnerName("Adam Smith");
	        
	        bike2 = new Bicycle( );     //Create and assign values to bike2
	        bike2.setOwnerName("Ben Jones");
	        
	        bike3 = new Bicycle ();
	        bike3.setOwnerName("jherry jibz");
	         
	        //Output information on two bicycles
	        owner1 = bike1.getOwnerName( );
	        owner2 = bike2.getOwnerName( );
	        owner3 = bike3.getOwnerName( );
	        
	        System.out.println(owner1 + " owns a bicyle");                            
	        System.out.println(owner2 + " also owns a bicycle"); 
	        System.out.println(owner3 + " also owns a bicycle too"); 
	       
	    }

}
