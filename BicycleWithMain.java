package jherry;

public class BicycleWithMain {

    // Data Member   
    private String ownerName;
    
    //Constructor
    public BicycleWithMain( ) {
        ownerName = "Unassigned";
    }
    
    //Returns the name of this bicycle's owner
    public String getOwnerName( ) {
        
        return ownerName;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName( String name) {
    
        ownerName = name;
    }   
    
    //The main method that shows a sample
    //use of the Bicycle class 
    public static void main(String[] arg) {
        
        BicycleWithMain myBike;
        
        myBike = new BicycleWithMain();
        
         myBike.setOwnerName("JIBZARMANY");
        
        System.out.println(myBike.getOwnerName() + " owns a bicycle");
    }

}
