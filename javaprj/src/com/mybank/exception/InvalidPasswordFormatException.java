package com.mybank.exception;

public class InvalidPasswordFormatException extends Exception {
	public InvalidPasswordFormatException () {
		super("잘못된 형식의 비밀번호 입니다");
	}
}
