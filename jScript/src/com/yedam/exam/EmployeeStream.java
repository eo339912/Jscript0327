package com.yedam.exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

public class EmployeeStream {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		Stream<Employee> stream = list.stream();
		stream.forEach(s->System.out.println(s.getFirstName()+", "+s.getSalary()));
	}
}
