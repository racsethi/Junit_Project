package Junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class StringFunctionstest {

	@Test
	@DisplayName("Positive Test")    //description
	public void test1() {
		assertTrue(Stringfunctions.isPlaindrome("oppo"));
	}
	
	@customAnnotation
	public void test2() {
		assertFalse(Stringfunctions.isPlaindrome("abcd"));
	}
}

