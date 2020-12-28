package com.Kewai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Myutil {
	private Myutil() {
		throw new AssertionError();
	}

	/**
	 * 统计一个文件中某个字符出现的次数
	 * 
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings("resource")
	public static int countWordInFile(String filename, String word) throws FileNotFoundException {
		int count = 0;

		FileReader fileReader = new FileReader(filename);
		BufferedReader br = new BufferedReader(fileReader);
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				int index = -1;
				while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
					count++;
					line = line.substring(index + word.length());
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return count;
	}

	public static void main(String[] args) throws Exception {
		int countWordInFile = Myutil.countWordInFile("src/com/Kewai/DateTime.java", "System");
		System.out.println(countWordInFile);
	}

}
