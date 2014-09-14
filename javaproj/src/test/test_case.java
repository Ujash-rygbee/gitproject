package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_case {

	@Test
	public void test() {
		Duplicate_catcher duplicate=new Duplicate_catcher("Mississipi");
		String modified=duplicate.remove_Duplicates();
		
		assertTrue("true",modified.equals("Misp"));
	}

}
