package Junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)
public class ExtensionPointEx {
	@Test
	@DisplayName("Positive Test")    //description
	public void test1() {
		assertTrue(Stringfunctions.isPlaindrome("oppo"));
	}
	

	@Test
	@DisplayName("Negative Test")
	public void test2() {
		assertFalse(Stringfunctions.isPlaindrome("abcd"));
	}
}



