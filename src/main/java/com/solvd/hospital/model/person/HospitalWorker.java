package com.solvd.hospital.model.person;

import com.solvd.hospital.exceptions.SalaryZeroException;

public abstract class HospitalWorker extends Person {
	private Double salary;

	//constructors
	public HospitalWorker(int id, String name, String phoneNumber, String address, Double salary) {
		super(id, name, phoneNumber, address);
		try {
			this.setSalary(salary);
		} catch (SalaryZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public HospitalWorker() {
		super();
		this.salary=0.0;
	}

	public Double getSalary() {
		return salary;
	}

	//getters and setters
	public void setSalary(Double salary) throws SalaryZeroException {
		if ((salary == null)||(salary<=0.0))
			throw new SalaryZeroException();
		this.salary = salary;
	}
	
}
