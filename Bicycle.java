package jherry;

public class Bicycle {
	 // Data Member   
    private String ownerName;
    
    //Constructor
    public Bicycle( ) {
        ownerName = "Unassigned";
    }
    
    //Returns the name of this bicycle's owner
    public String getOwnerName( ) {
        
        return ownerName;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
    
        ownerName = name;
    }    

}
