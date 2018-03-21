package co.com.jjoc007.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RestClientBuilder {

	public static Object buildClient(String endpointUrl, Class<?> clientClass) {

		Dispatcher dispatcher = new Dispatcher();
		dispatcher.setMaxRequests(10);

		OkHttpClient httpClient = new OkHttpClient
				.Builder()
				.dispatcher(dispatcher)
				.connectTimeout(60, TimeUnit.SECONDS)
				.readTimeout(30, TimeUnit.SECONDS)
				.writeTimeout(30, TimeUnit.SECONDS)
				.build();

		return new Retrofit.Builder()
				.client(httpClient)
				.baseUrl(endpointUrl)
				.addConverterFactory(JacksonConverterFactory.create())
				.build()
				.create(clientClass);
	}

}
