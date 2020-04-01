package com.yedam.departments;

import java.util.List;

public class DepartmentsMain {
	public static void main(String[] args) {
		DepartmentsDAO d = new DepartmentsDAO();
		
		List<Departments> dlist = d.getDepartmentsList();
		
		for(Departments ds : dlist) {
			System.out.println(ds);
		}
	}
}
