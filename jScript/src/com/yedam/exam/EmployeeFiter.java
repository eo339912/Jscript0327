package com.yedam.exam;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeFiter {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		Stream<Employee> stream = list.stream();
		stream.filter( s -> s.getSalary()>=1000)
//				.sorted()
				.forEach(n -> System.out.println(n.getFirstName()+", "+n.getSalary()));;
	}

}
