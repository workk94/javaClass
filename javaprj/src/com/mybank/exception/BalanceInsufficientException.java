package com.mybank.exception;

public class BalanceInsufficientException extends Exception{

	public BalanceInsufficientException() {
	          super( "잔액부족");
	}
}
