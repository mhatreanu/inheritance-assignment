package com.capgemini.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;


class EmployeeTest {

		private Employee employee;
	@BeforeEach
	public void setUp() {
		employee=new Employee(101,"John",20_000,5_000);
	}
	
	@Test
	public void testEmployeeCreatedWithDeafultConstructor() {
		assertNotNull(employee);
	}
	

	@Test
	public void testEmployeeCreatedWithParameterizedConstructor() {		
		assertEquals(101,employee.getEmployeeId());
		assertEquals("John",employee.getEmployeeName());
		assertEquals(20_000,employee.getBasicSalary());
		assertEquals(5_000,employee.getMedicalAllowance());
	}
	
	@Test
	public void testCalculateGrossSalary() {
		assertEquals(35000,employee.calculateGrossSalary());
	}
	
	@Test
	public void testCalculateNetSalary() {
		
		assertEquals(32400,employee.calculateNetSalary());
	}
}
