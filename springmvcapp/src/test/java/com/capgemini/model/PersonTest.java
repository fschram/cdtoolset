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
	
	public void testEqual(){
		Person p = new Person();
		p.setFirstName("firstName");		
		Assert.assertEquals("Test voornaam", "Pietje", p.equals("firstName"));
	}
}
