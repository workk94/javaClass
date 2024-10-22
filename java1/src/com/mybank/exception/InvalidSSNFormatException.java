package com.mybank.exception;

public final class InvalidSSNFormatException extends Exception{
	public InvalidSSNFormatException () {
		super("잘못된 형식의 주민번호 입니다");
	}
}
