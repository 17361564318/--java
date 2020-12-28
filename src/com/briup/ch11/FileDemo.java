package com.briup.ch11;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		String filePath = "src/com/briup/ch11/d.txt";

		try {
			File file = new File(filePath);
			if (!file.exists()) {
				file.createNewFile();
			}
//			System.out.println(file.delete());
//			System.out.println(file.isFile());
			
			System.out.println(file.canExecute());
			
			System.out.println(file.length());
			
			System.out.println(file.getName());
			
			System.out.println(file.getPath());
			
			System.out.println(file.getAbsolutePath());
			
			System.out.println(file.getParentFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
