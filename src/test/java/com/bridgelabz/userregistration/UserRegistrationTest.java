package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	boolean result;

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void isValidUserFirstName() {
		result = userRegistration.isValidUserFirstName("Neeta");
		Assert.assertEquals(true, result);

	}

	@Test
	public void isValidUserLastName() {
		result = userRegistration.isValidUserLastName("Mourya");
		Assert.assertEquals(true, result);

	}

}
