package Junits;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;



public class AssumptionsExample {

	
	@BeforeEach
	public void setup() {
		System.setProperty("ENV", "DEV");
	}
	
	@Test
	public void Test() {
		String ExpectedEnv = "DEV" ;
		String ActualEnv = System.getProperty("ENV");
		
		assumeTrue(ExpectedEnv.equals(ActualEnv));
		assertTrue(Stringfunctions.isPlaindrome("oppo"));
	}
		
	}

