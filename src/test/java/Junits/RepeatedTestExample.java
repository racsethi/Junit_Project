package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {

	@RepeatedTest(2)
	public void test1() {
		assertTrue(Stringfunctions.isPlaindrome("oppo"));
	}
}
