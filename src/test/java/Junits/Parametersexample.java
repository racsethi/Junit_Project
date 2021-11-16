package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class Parametersexample {


	@ParameterizedTest
	@ValueSource(strings = {"oppo","madam","abcd"})
	public void test(String Name) {
		assertTrue(Stringfunctions.isPlaindrome(Name));
	}
	
	@ParameterizedTest
	 @ValueSource(ints= {5,7,9,10})
    public void oddNumCheck(int num) {
        
        assertTrue(num%2!=0);
    }
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void MonthCheck(Month month) {
		int Monthnum = month.getValue();
		assertTrue(Monthnum>=1 && Monthnum<=12);
	}
	@ParameterizedTest
	@EnumSource(value = Month.class ,names = {"APRL","JUNE","SEPTEMBER","NOVEMBER"})
	public void MonthDaysCheck(Month month) {
		int days =month.length(false);
		assertEquals(days,30);
	}
	@ParameterizedTest
	@MethodSource("DpMethod")
	public void Plaindromecheck1(String Name) {
		assertTrue(Stringfunctions.isPlaindrome(Name));
		static Stream<String> DpMethod() {
			return Stream.of("reacecar","mom","radar");
		}
		
	}
	
}
