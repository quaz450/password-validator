import static org.junit.Assert.*;
import org.junit.Test;


public class Validator_Test {

	@Test
	public void passwordIsPassword() {
		String str = "password";
		assertEquals(1, Validator.validate(str));
	}
	
	@Test
	public void passwordIsNotPassword() {
		String str = "notPassw0rd";
		assertEquals(0, Validator.validate(str));
	}
	
	@Test
	public void passwordIsShort() {
		String str = "pass";
		assertEquals(1, Validator.validate(str));
	}
	
	@Test
	public void passwordIsNotShort() {
		String str = "EightLong";
		assertEquals(0, Validator.validate(str));
	}
		
}
