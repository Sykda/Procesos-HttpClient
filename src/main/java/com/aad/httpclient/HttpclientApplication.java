package com.aad.httpclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpclientApplication {

	public static void main(String[] args) {
		
		PeticionesAPI api = new PeticionesAPI();

		try {
			
			//Peticiones a nuestra api
			 api.get(); 
			 api.post(); 
			 api.get(); 
			 api.put(); 
			 api.get(); 
			 api.delete();
			 api.get();
			 
			
			//Peticiones a la api pública
			api.get("https://www.tomorrow.io/weather-api/");
			api.delete("https://www.tomorrow.io/weather-api/");
			
		} catch (Exception e) {
			System.out.println("Algo ha salido mal: " + e.getMessage());
		}
	}

}
