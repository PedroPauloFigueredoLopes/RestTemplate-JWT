package br.com.neki.s2p2backend.model;

import org.springframework.security.core.Authentication;

public class Request {
	private String name;
	private String password;

	public Request(String email, String password) {
		super();
		this.name = email;
		this.password = password;

	}

	public Request() {

	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.name = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
