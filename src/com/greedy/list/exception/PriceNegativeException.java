package com.greedy.list.exception;

public class PriceNegativeException extends Exception {

	public PriceNegativeException() {}
	
	public PriceNegativeException(String message) {
		super(message);
	}
}
