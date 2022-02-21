package com.aad.httpclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpclientApplication {

	public static void main(String[] args) {
		Crud crud = new Crud();

		try {
			crud.get();
			crud.post();
			crud.put();
			crud.delete();
		} catch (Exception e) {
			System.out.println("Algo ha salido mal: " + e.getMessage());
		}
	}

}
