package Junits;

import org.junit.jupiter.api.TestFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;

public class DynamicTestExamples {

	@TestFactory
	public Collection<DynamicTest> method1() {
		
		return Arrays.asList(
				
		DynamicTest.dynamicTest("Positive Test1", 
				() -> assertTrue(Stringfunctions.isPlaindrome("oppo"))),
				
		DynamicTest.dynamicTest("Positive Test2", 
				() -> assertTrue(Stringfunctions.isPlaindrome("madam"))),
		
		DynamicTest.dynamicTest("Negative Test", 
				() -> assertFalse(Stringfunctions.isPlaindrome("abcd")))			
		);						
		
	}
}
