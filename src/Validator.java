/* Autour: Jessi Campbell
 * Date: 2018-02-07
 */

public class Validator {

	public static void main(String[] args) {

	}
	
	public static int validate(String pw){
		int flag = 0;
		if(pw.equalsIgnoreCase("password"))
			flag++;
		if(pw.length()<8)
			flag++;
		return flag;
	}

}
