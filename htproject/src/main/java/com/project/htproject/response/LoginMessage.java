package com.project.htproject.response;

public class LoginMessage {

	private String message;
	private boolean status;
	private int Id;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public LoginMessage(String message, boolean status, int id) {
		super();
		this.message = message;
		this.status = status;
		Id = id;
	}
	@Override
	public String toString() {
		return "LoginMessage [message=" + message + ", status=" + status + ", Id=" + Id + "]";
	}
	
	
	
}
