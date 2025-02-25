package com.solidprinciples;

public class Developer implements Employee,Developable {
    private double salary;

    public Developer(double salary) {
        this.salary = salary;
    }

	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
		System.out.println("Developing software applications.");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Writing and maintaining code.");
		
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

}
