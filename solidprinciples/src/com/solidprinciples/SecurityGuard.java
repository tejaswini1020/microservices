package com.solidprinciples;

public class SecurityGuard implements Employee,Secureable {
	 private double salary;

	    public SecurityGuard(double salary) {
	        this.salary = salary;
	    }

		@Override
		public void guardBuilding() {
			// TODO Auto-generated method stub
			System.out.println("Patrolling and monitoring the security systems.");
		}

		@Override
		public void work() {
			// TODO Auto-generated method stub
			System.out.println("Ensuring security of the premises.");
			
		}

		@Override
		public double getSalary() {
			// TODO Auto-generated method stub
			return salary;
		}

}
