package jherry;
import javax.swing.*;

	import java.text.SimpleDateFormat;
import java.util.*;
	
public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String Test, str1, str2,str3,str4;
			
			Test = new String ("parameter");
			System.out.println (Test.substring(0,3));
			System.out.println (Test.length());
			System.out.println (Test.indexOf("ram")+1);

			str1 = "fam";
			str2= "OUSLY";
			str3 = "lovingly";
			 
			str4 = str1 + str2 ;
			System.out.println (str4);
			
			// prints normal system date in full
			Date today = new Date ();
				System.out.println(today.toString());
			// simple date format
			SimpleDateFormat sdf1, sdf2;
			sdf1 = new SimpleDateFormat("MM/dd/yy" );
			sdf2 = new SimpleDateFormat("MMMM,dd,yyyy" );

			System.out.println (sdf1.format(today));
				System.out.println (sdf2.format(today));
				
				/*System.out.println ("PLEASE ENTER YOUR FIRST NAME");
				Scanner name = new Scanner(System.in);
				String Fname = name.next();
				System.out.println ("Nice to meet you" + "  " + Fname); 
				*/
				
			
			/*	String rname, first, middle, last,space, monogram;
				
				space = " ";

				//Input the full name
				String showInputDialog = extracted();
				rname = showInputDialog;
				//Extract first, middle, and last names
				first = rname.substring(0, rname.indexOf(space));
				rname = rname.substring(rname.indexOf(space)+1, rname.length());

				middle = rname.substring(0, rname.indexOf(space));
				last = rname.substring(rname.indexOf(space)+1, rname.length());

				//Compute the monogram
				monogram = first.substring(0, 1) + 	
						middle.substring(0, 1) + 	
							last.substring(0,1);
				//Output the result
				System.out.println (monogram);

         */


	
	}

	private static String extracted() {
		// TODO Auto-generated method stub
		return null;
	}

}
