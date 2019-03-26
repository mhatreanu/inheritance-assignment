package com.capgemini.employee.model;

public class MarketingExecutive extends Employee{
	private double kmTravelled;
	private double telephoneAllowance;
	private double tourAllowance;
	
	public MarketingExecutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medicalAllowance, double kmTravelled ) {
		super(employeeId, employeeName, basicSalary, medicalAllowance);
		// TODO Auto-generated constructor stub
		this.kmTravelled=kmTravelled;
	}
	
	
	public double calculateGrossSalary() {
		return (super.calculateGrossSalary()+tourAllowance*kmTravelled+telephoneAllowance);
		
	}
	
}
