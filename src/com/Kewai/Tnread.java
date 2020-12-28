package com.Kewai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tnread {

	public static void main(String[] args) throws Exception {
		ExecutorService threadPool = Executors.newFixedThreadPool(100);
		threadPool.execute(new Thread());
	}

}
