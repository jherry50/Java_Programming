package jherry;
import java.util.Random;
public class starts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int x = 5;
		int y = 33;
		int z;
		 z = x* y;
		
		System.out.println ( z);
		*/
		// random numbers generation
		Random random;
		random = new Random();
		int num = random.nextInt(11);
		System.out.println(num);
	}

}
