package packageA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Junits.Stringfunctions;

public class classTestA {
	
	@Tag("Sanity")
	@DisplayName("Test1")
	@Test
	public void test1() {
		
		assertTrue(Stringfunctions.isPlaindrome("oppo"));
	}

}
