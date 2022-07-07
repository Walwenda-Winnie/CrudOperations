package com.crudoperations.model;


public class ResponseModel {
	String messageCode="";
	String message="";
	
	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseModel() {
		super();
	
	}

	public ResponseModel(String messageCode, String message) {
		super();
		this.messageCode = messageCode;
		this.message = message;
	}
	

}
