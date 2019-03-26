package com.capgemini.employee.model;

public class Employee {

	private String employeeName;
	private int employeeId;
	private double basicSalary;
	private double medicalAllowance;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medicalAllowance) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary ;
		this.medicalAllowance = medicalAllowance;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}
	
	public double calculateGrossSalary() {
		double hra=basicSalary/2;
		double grossSalary=basicSalary+hra+medicalAllowance;
		return grossSalary;
	}
	public double calculateNetSalary() {
		double pf=0.12*basicSalary;
		double pt=200;
		double netSalary=calculateGrossSalary()-(pf+pt);
		return netSalary;
	}

}
