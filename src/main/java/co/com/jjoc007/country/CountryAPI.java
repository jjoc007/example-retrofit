package co.com.jjoc007.country;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CountryAPI {

	@GET("/country/get/all")
	Call<RestResponse> getCountries();

}
