package com.yedam.study;

public class EmpServiceImp implements EmpService{

	@Override
	public void getEmployee(int empId) {
		System.out.println("empId: " + empId);
	}

}
