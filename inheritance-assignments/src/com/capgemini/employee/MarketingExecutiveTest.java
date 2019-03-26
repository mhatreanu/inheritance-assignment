package com.capgemini.employee;
import  com.capgemini.employee.model.MarketingExecutive;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarketingExecutiveTest {
	
	private MarketingExecutive executive;
	@BeforeEach
	public void setUp() {
		executive=new MarketingExecutive(3,"Mac",50000,2000,100);	
	}
	
	@Test
	public void testMarketingExecutiveCreatedWithDefaultConstructor() {
		MarketingExecutive executive=new MarketingExecutive();
		assertNotNull(executive);
	}

	@Test
	public void testMarketingExecutiveCreatedWithParameterizedConstructor() {
		assertEquals(3,executive.getEmployeeId());
		assertEquals("Mac",executive.getEmployeeName());
		assertEquals(50000,executive.getBasicSalary());
		assertEquals(2000,executive.getMedicalAllowance());
	}
	
	@Test
	public void testCalculateGrossSalary() {
		assertEquals(77000,executive.calculateGrossSalary(),0.01);
	}
	@Test
	public void testCalculateNetSalary() {
		assertEquals(70800,executive.calculateNetSalary(),0.01);
	}
}
