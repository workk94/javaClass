package com.mybank.exception;

public class InvalidSSNFormatException extends RuntimeException{
	public InvalidSSNFormatException () {
		super("잘못된형식의 주민번호");
	}
}
