package com.devsuperior.dscatalog.services.exceptions;

public class DatabaseExcption extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DatabaseExcption(String msg) {
		super(msg);
	}
	
}
