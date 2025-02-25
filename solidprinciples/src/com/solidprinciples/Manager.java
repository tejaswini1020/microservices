package com.solidprinciples;

public class Manager implements Employee , Manageable {
    private double salary;

    public Manager(double salary) {
        this.salary = salary;
    }

	@Override
	public void manageTeam() {
		// TODO Auto-generated method stub
		System.out.println("Conducting meetings and overseeing projects.");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Managing the team and projects.");
		
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	
	

}
