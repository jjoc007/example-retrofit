package co.com.jjoc007.country;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestResponse {

	@JsonProperty("RestResponse")
	ResponseCountryAPI responseCountryAPI;

	public RestResponse(ResponseCountryAPI responseCountryAPI) {
		super();
		this.responseCountryAPI = responseCountryAPI;
	}

	public RestResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseCountryAPI getResponseCountryAPI() {
		return responseCountryAPI;
	}

	public void setResponseCountryAPI(ResponseCountryAPI responseCountryAPI) {
		this.responseCountryAPI = responseCountryAPI;
	}

	@Override
	public String toString() {
		return "RestResponse [responseCountryAPI=" + responseCountryAPI + "]";
	}
	
	
	
}
