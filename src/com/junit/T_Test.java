package com.junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import org.junit.Test;

import com.home.T;

public class T_Test {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@Before
	public void before() {
		System.out.println("befor");
	}
	
	@Test
	public void testAdd() {
		assertEquals(8, new T().add(3, 5));
		assertThat(new T().add(3, 5) ,is(8));
	}
	
	//@Ignore
	@Test(expected=java.lang.ArithmeticException.class, timeout=100)
	public void testDiv() {
		int d=new T().div(8, 0);
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
}
