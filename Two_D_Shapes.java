package jherry;

public class Two_D_Shapes extends Shape {
	byte nos;
	public Two_D_Shapes(double l,double h, double w, double r,byte n ){
		super (l,h,w,r);
		
		nos = n;
	}
	
	public int getNo_Of_Sides (){
		return nos;
	}
	public void setNo_Of_Sdes(byte n){
		 nos = n;
	}

}
