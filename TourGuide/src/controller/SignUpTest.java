package controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import application.Account;
import role.Person;

public class SignUpTest {

	@Test
	public void test() {
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		accounts.add(new Account("user1", "user123", "", "/icons/userAvatar.png",
				new Person("", "", "12345", "", null)));
		
		boolean result = SignUpController.getInstance().usernameExists(accounts, "user1");
		assertEquals(true, result);
		
		boolean result1 = SignUpController.getInstance().usernameExists(accounts, "user22");
		assertEquals(false, result1);
		
		boolean result2 = SignUpController.getInstance().umcnExists(accounts, "12345");
		assertEquals(true, result2);
		
		boolean result3 = SignUpController.getInstance().umcnExists(accounts, "241412");
		assertEquals(false, result3);
		
	}

}
