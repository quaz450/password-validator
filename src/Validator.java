import java.util.Scanner;

/* Autour: Jessi Campbell
 * Date: 2018-02-07
 */

public class Validator {

	public static void main(String[] args) {

	}
	
	public static boolean validate(String pw){
		if(pw.equalsIgnoreCase("password"))
			return false;
		if(pw.length()<8)
			return false;
		return true;
	}

}
