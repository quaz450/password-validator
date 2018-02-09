import static org.junit.Assert.*;
import org.junit.Test;


public class Validator_Test {
	//pass at least 1 rule rule
	@Test
	public void passwordIsNotPassword() {
		String str = "notpassword";
		assertTrue(Validator.validate(str)>=1);	
	}
	
	@Test
	public void passwordIsNotShort() {
		String str = "eightlong";
		assertTrue(Validator.validate(str)>=1);	
	}
	
	@Test
	public void hasDifCase() {
		String str = "ThisIsMyPassword";
		assertTrue(Validator.validate(str)>=1);	
	}
	
	@Test
	public void hasNumber(){
		String str = "MyPass123";
		assertTrue(Validator.validate(str)>=1);
	}
	
	@Test
	public void noThreeConsec(){
		String str = "NoConsecutive123";
		assertTrue(Validator.validate(str)>=1);
	}
	
	//at least 1 rule is broken
	@Test
	public void passwordIsPassword() {
		String str = "PassWOrd";
		assertTrue(Validator.validate(str)<5);	
	}
	
	
	@Test
	public void passwordIsShort() {
		String str = "pass";
		assertTrue(Validator.validate(str)<5);	
	}

	@Test
	public void hasNoDifCase() {
		String str = "thisismypassword";
		assertTrue(Validator.validate(str)<5);	
	}
	
	@Test
	public void hasNoNumber(){
		String str = "qwertyuio";
		assertTrue(Validator.validate(str)<5);
	}
	
	@Test
	public void threeConsec(){
		String str = "AaaBbBCccDdEe";
		assertTrue(Validator.validate(str)<5);
	}
	
	
	

		
}
