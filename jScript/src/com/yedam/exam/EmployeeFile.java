package com.yedam.exam;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeFile {
	public static void main(String[] args) throws IOException {
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		
		FileWriter fw = new FileWriter("src/com/yedam/exam/employees.txt");
		for(Employee emp : list) {
			String name = emp.firstName;
			int sal = emp.salary;
			fw.write(name+", "+sal+"\n");
			fw.flush();
		}
		fw.close();
		
	}
}
