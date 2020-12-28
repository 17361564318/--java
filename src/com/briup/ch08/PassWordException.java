package com.briup.ch08;

//如果让他称为运行时异常，需要继承runtimeexception，否则继承Exception
public class PassWordException extends RuntimeException{
	//一般需要让子类构造器和父类构造器保持一致
	public PassWordException() {
		super();
	}

	public PassWordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PassWordException(String message, Throwable cause) {
		super(message, cause);
	}

	public PassWordException(String message) {
		super(message);
	}

	public PassWordException(Throwable cause) {
		super(cause);
	}

	

}
