package packageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Junits.Stringfunctions;

public class classTestB {
	

	@Tag("Sanity")
	@DisplayName("Test2")
	@Test
	public void test2() {
		
		assertTrue(Stringfunctions.isPlaindrome("oppo"));
	}
}
	
