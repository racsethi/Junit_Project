package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public interface DefaultTestinterface {

	
	public void method1();
	public void method2();
	
	@Test
	@DisplayName("Interface")
	default void test() {
		assertTrue(Stringfunctions.isPlaindrome("oppo"));
	}
}
