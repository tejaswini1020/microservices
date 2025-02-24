package com.s;

public class Main {
	 public static void main(String[] args) {
	        employee emp = new employee("Tejaswini", "Software Engineer");
	        
	        SalaryCalculator salaryCalculator = new SalaryCalculator();
	        double salary = salaryCalculator.calculateSalary(5000);
	        System.out.println("Calculated Salary: " + salary);
	        
	        EmployeeReport report = new EmployeeReport();
	        report.generateReport(emp);
	    }

}
