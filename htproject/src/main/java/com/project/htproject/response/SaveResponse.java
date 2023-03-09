package com.project.htproject.response;

public class SaveResponse {

	private String message;
    private boolean status;
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
	@Override
	public String toString() {
		return "SaveResponse [message=" + message + ", status=" + status + "]";
	}
	public SaveResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public SaveResponse() {
		super();
	}
    
}
