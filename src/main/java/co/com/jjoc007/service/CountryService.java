package co.com.jjoc007.service;

import java.io.IOException;

import co.com.jjoc007.country.CountryAPI;
import co.com.jjoc007.country.RestResponse;
import co.com.jjoc007.utils.RestClientBuilder;

public class CountryService {

	public void getCountries() {
		
		try {
			CountryAPI countryAPI = (CountryAPI) RestClientBuilder.buildClient("http://services.groupkt.com", CountryAPI.class);
			RestResponse response = countryAPI.getCountries().execute().body();
			System.out.println(response);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		CountryService cs =  new CountryService();
		cs.getCountries();
		
	}
	
}
