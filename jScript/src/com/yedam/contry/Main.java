package com.yedam.contry;

import java.util.List;



public class Main {
	public static void main(String[] args) {
		//정의하는 부분				//구현하는 부분
		CountryService service = new CountryServiceImp();
		List<Country> list = service.getCountryList();
		for(Country s : list) {
			System.out.println(s);
		}
		
	}
}
