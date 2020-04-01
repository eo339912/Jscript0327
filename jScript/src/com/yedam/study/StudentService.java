package com.yedam.study;

import java.util.List;

public interface StudentService { //기능만 정의되있음
	public List<Student> getStudList();
		
	public Student getStudent(int id); 
}
