import static org.junit.Assert.*;
import org.junit.Test;


public class Validator_Test {

	@Test
	public void passwordIsPassword() {
		String str1 = "password", str2 = "PASSWORD", str3 = "PasSwOrD";
		assertEquals(false, Validator.validate(str1));
		assertEquals(false, Validator.validate(str2));
		assertEquals(false, Validator.validate(str3));
	}
	
	@Test
	public void passwordIsNotPassword() {
		String str1 = "bassword", str2 = "PazZWuRb", str3 = "PasSw0rD";
		assertEquals(true, Validator.validate(str1));
		assertEquals(true, Validator.validate(str2));
		assertEquals(true, Validator.validate(str3));
	}
	
	@Test
	public void passwordIsShort() {
		String str1 = "pass", str2 = "PSWRD", str3 = "qwerty";
		assertEquals(false, Validator.validate(str1));
		assertEquals(false, Validator.validate(str2));
		assertEquals(false, Validator.validate(str3));
	}
	
	@Test
	public void passwordIsNotShort() {
		String str1 = "crazyEight", str2 = "12345678", str3 = "AbCdeFghiJ";
		assertEquals(true, Validator.validate(str1));
		assertEquals(true, Validator.validate(str2));
		assertEquals(true, Validator.validate(str3));
	}
		
}
