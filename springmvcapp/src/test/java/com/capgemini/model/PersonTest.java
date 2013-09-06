package com.capgemini.model;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void personEquals() {
		Person p = new Person();
		p.setFirstName("Andy");
		p.setLastName("Gibson");

		
		Person p2 = new Person();
		p2.setFirstName("Andy");
		p2.setLastName("Gibson");

		Assert.assertTrue(p.equals(p2));
	}
	@Test
	public void personNotEquals() {
		Person p = new Person();
		p.setFirstName("Andy");
		p.setLastName("Gibson");
		
		Person p2 = new Person();
		p2.setFirstName("Andy");
		p2.setLastName("Gibsonson");

		Assert.assertFalse(p.equals(p2));
	}
}
