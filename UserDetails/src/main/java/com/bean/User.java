package com.bean;

public class User {
	protected int id;
	protected String name;
	protected String email;
	protected int phoneno;
	
	public User() {
	}
	
	public User(String name, String email, int phoneno) {
		super();
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
	}

	public User(int id, String name, String email, int phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

}