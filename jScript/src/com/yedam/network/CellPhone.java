package com.yedam.network;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CellPhone {
	static String fileName = "src/com/yedam/network/phoneList.txt";
	static class Address{
		String name;
		String age;
		String phone;
		public Address(String name, String age, String phone) {
			super();
			this.name = name;
			this.age = age;
			this.phone = phone;
		}
		
	}
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1. 입력 | 2. 조회");
		int num = scn.nextInt();
		switch(num) {
	    case 1:
	    	scn.nextLine();
	    	System.out.println("친구 연락처 관리.");
			System.out.println("친구 이름");
			String name = scn.nextLine();
			
			System.out.println("친구 나이");
			String age = scn.nextLine();
			
			System.out.println("친구 번호");
			String phone = scn.nextLine();
			
			Address addr = new Address(name, age, phone);
			try {
				FileWriter fw = new FileWriter(fileName, true);
				fw.write("\n"+addr.name + "," + addr.age + "," + addr.phone+"\n");
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("end of program");
	        break;
	    case 2:
	    	 try{
	              //입력 스트림 생성
	             FileReader filereader = new FileReader(fileName);
	             int singleCh = 0;
	             while((singleCh = filereader.read()) != -1){
	                 System.out.print((char)singleCh);
	             }
	             filereader.close();
	         }catch (FileNotFoundException e) {
	             // TODO: handle exception
	         }catch(IOException e){
	             System.out.println(e);
	         }

	         break;
		}
		
		
	}
}
