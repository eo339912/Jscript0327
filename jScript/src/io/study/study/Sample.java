package com.yedam.study;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static int sum(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<Student> list = dao.getEmpList();
		for(Student s : list) {
			System.out.println(s);
		}
		System.out.println("=====================");
		int result = sum(3,9);
		
		//static이 없으면 인스턴스를 만들어야됨
		Sample s = new Sample();
		int result1 = s.minus(6, 2);	
		
		Person p1 = new Person();
		//p1.age = 12;
		
		p1.setName("Hong");
		p1.setAge(12);
		String name = p1.getName();
		int age = p1.getAge();
				
		System.out.println(name);
		
		Person p2 = new Person("Hwang", 37);
		
		//
		Student s1 = new Student();
		s1.setAge(20);
		s1.setName("park");
		s1.setSchool("sd");
		
		Student s2 = new Student("Lim", 22, "yedam");
		
		System.out.println(s1.toString());
		System.out.println("=====================");
		
		Person[] persons = new Person[5];
		persons[0] = p1;
		persons[1] = s1; //같은 타입만들어간다
		persons[2] = new Student();
		persons[3] = new Person("Lee", 27);
		persons[4] = new Person();
		
		String searchName = "park";
		
		for(Person p : persons) {
			if(p.getName() != null && p.getName().equals(searchName))
				System.out.println(searchName + " : " + p);
		}
		System.out.println("=====================");
		for(Person p : persons) {
			System.out.println(p);
		}
		///////////////////////////////////////////
		System.out.println("=====================");
		List<Person> list2 = new ArrayList<>();
		list2.add(p1);
		list2.add(p2);
		list2.add(s1);
		list2.add(s2);
		//list.remove(p1);
		if(list2.remove(p2)) {
			System.out.println("p2가 삭제되었습니다.");
		}
		for(Person p : list2) {
			System.out.println(p);
		}
		
	}
}
