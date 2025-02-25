package com.solidprinciples;

public class EmployeeManagement {
	 public static void main(String[] args) {
	        Employee manager = new Manager(80000);
	        Employee developer = new Developer(60000);
	        Employee guard = new SecurityGuard(30000);

	        manager.work();
	        System.out.println("Manager Salary: " + manager.getSalary());

	        developer.work();
	        System.out.println("Developer Salary: " + developer.getSalary());

	        guard.work();
	        System.out.println("Security Guard Salary: " + guard.getSalary());

	        // Role-specific actions
//	        ((Manager) manager).manageTeam();
//	        ((Developer) developer).writeCode();
//	        ((SecurityGuard) guard).guardBuilding();
	    }

}
