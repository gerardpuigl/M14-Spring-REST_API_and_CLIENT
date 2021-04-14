package com.itacademy.CrudPictures.exceptions;

public class FullShopException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	//custom Exception to throw when store is full
	public FullShopException(String msg) {
		super(msg);
	}

}
