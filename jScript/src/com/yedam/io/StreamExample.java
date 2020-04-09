package com.yedam.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.yedam.lambda.Student;

public class StreamExample {
	public static void main(String[] args) throws IOException {
		List<String> list = Arrays.asList("홍길동", "김유신", "서혜원", "이지원");
//		==> name.txt
		File file = new File("c:/Temp/name.txt");
		if(file.exists() == false) {
			file.createNewFile();
		}
		
				
		//System.out.println(list);
		
		FileOutputStream fos = new FileOutputStream("c:/Temp/name.txt");
		
		for(String list1 : list) {
			System.out.println(list1);
		}
		
		int readByte;
		while((readByte = fis.read()) != -1) {
			fos.write(readByte);
		}
		System.out.print((char)readByte);
		fos.flush();
		fos.close();
		fis.close();
				
	}
}
