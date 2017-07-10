package controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

	@Test
	public void test() {
		boolean result = LogInController.getInstance().checkLogin("Marko", "pass");
		assertEquals(false, result);

		boolean result1 = LogInController.getInstance().checkLogin("jeca", "pereca");
		assertEquals(true, result1);
	}

}
