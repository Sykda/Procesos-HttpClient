package com.aad.httpclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HttpclientApplication {

	public static void main(String[] args) {
		Crud crud = new Crud();

		try {
			crud.get();
			crud.post();
			crud.get();
			crud.put();
			crud.get();
			crud.delete();
			crud.get();
		} catch (Exception e) {
			System.out.println("Algo ha salido mal: " + e.getMessage());
		}
	}

}
