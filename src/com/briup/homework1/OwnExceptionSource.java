package com.briup.homework1;

import com.briup.ch08.PassWordException;

public class OwnExceptionSource {
	// 要求包含方法a()，a()抛出OwnException
	public void a() throws OwnException{
			
				throw new OwnException("exception");
			}
	}

