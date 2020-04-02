package com.yedam.contry;

import java.util.List;

public class CountryServiceImp implements CountryService{
	CountryDAO dao = new CountryDAO();

	@Override
	public List<Country> getCountryList() {
		return dao.getCountryList();
	}
	
	
}
