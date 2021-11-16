package Junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExample {

	
@Test
public void test() {
	
	String name1 = "Rohan";
	String name2 = "Rohan";
	assertEquals(name1,name2);
	
	String[] expectedArray = {"one","two"};
	String[] resultArray = {"one","two"};
	assertArrayEquals(expectedArray,resultArray);
}
}
