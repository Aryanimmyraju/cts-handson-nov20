package com.org.springcore;

public class EmployeeService {
	private EmployeeDao empDao;
	
	public void storeEmployee() {
		System.out.println("storeEmployee()");
		empDao.store();
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	
	
}
