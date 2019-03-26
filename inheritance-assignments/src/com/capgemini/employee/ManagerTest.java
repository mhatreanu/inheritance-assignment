package com.capgemini.employee;
import  com.capgemini.employee.model.Manager;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ManagerTest {

	private Manager manager=new Manager();
	@BeforeEach
	public void setUp() {
		manager=new Manager(2,"Sam",20_000,5000);
	}

	@Test
	public void testManagerCreatedWithDefaultConstructor() {
		Manager nmanager=new Manager();
		assertNotNull(nmanager);
	}
	
	@Test
	public void testManagerCreatedWithParameterizedConstructor() {
		Manager nmanager=new Manager(2,"S",50000,2000);
		assertNotNull(nmanager);
		
	}
	
	@Test
	public void testCalculateGrossSalary() {
		assertEquals(39800,manager.calculateGrossSalary(),0.01);
	}
	
	@Test
	public void testCalculateNetSalary() {
		assertEquals(37200,manager.calculateNetSalary(),0.01);
	}
}
