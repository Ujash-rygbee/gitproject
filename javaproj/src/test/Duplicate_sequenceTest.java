package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Duplicate_sequenceTest {

	@Test
	public  void test()
	{
	 Duplicate_sequence check=new Duplicate_sequence("Mississipi");
	 String modified=check.remove_Duplicate();
	 
	assertTrue("true",modified.equals("Misisipi"));

    }
	
}