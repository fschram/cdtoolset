package com.capgemini.model;
import org.junit.Assert;
import org.junit.Test;

import com.capgemini.model.Person;

public class PersonTest {

	@Test
	public void testConstructor() {
		Person p = new Person("Pietje", "Puk");
		Assert.assertEquals("Test voornaam", "Pietje", p.getFirstName());
	}
	
	@Test
	public void testEqual(){
		Person p = new Person();
		p.setFirstName("firstName");
		Person p2 = new Person();
		Assert.assertFalse(p.equals(p2));
	}
}
