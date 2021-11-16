package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith( ParaneterProvideclass.class)
public class junitwithParameterclass {
	
	@Test
	@DisplayName("Positive Test")    //description
	public void test1(String param1) {
		assertTrue(Stringfunctions.isPlaindrome(param1));
	}
	
}
