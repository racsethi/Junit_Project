package Junits;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Firstjunit {

	@BeforeAll          // static aayega  before all mein
	 public static void Method3() {
		
		   System.out.println("Inside Before All");
			}
	
	@BeforeEach
	public void Method1() {
		
		System.out.println("Inside Before Method");
	}
	
	@Test
	public void test1() {

		System.out.println("Inside test1");
		
		boolean flag =true;
	   Assert.assertTrue(flag);
	}

	@Test
	public void test2() {

		System.out.println("Inside test2");
	}

	
	@AfterEach
   public void Method2() {
		
   System.out.println("Inside After Method");
	}
	
	@AfterAll
	 public static void Method4() {
			
		   System.out.println("Inside After All");
			
		
	}
	
}