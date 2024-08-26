package day16.exception.ex;

public final class AgeOutOfRangeException extends Exception{
	AgeOutOfRangeException(){
		super("나이 범위 잘못됨");
	}
}
