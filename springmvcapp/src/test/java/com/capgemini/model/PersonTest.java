package com.capgemini.model;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
	
	@Test
	public void shouldCreatePerson() {
		Person p=new Person("samuel","maljaars");
		Assert.assertEquals("samuel", p.getFirstName());
		Assert.assertEquals("maljaars", p.getLastName());		
	}
	
	
	
	
}


