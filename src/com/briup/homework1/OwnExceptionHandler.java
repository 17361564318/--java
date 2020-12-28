package com.briup.homework1;

public class OwnExceptionHandler {
	//要求包含main()，在main()中调用OwnExceptionSource类的a()，
	//并处理相关异常
	public static void main(String[] args) {
		OwnExceptionSource source = new OwnExceptionSource();
			try {
				source.a();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


