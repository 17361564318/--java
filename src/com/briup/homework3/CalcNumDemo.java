package com.briup.homework3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.javafx.collections.MappingChange.Map;

public class CalcNumDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("src/com/briup/ch11/a.txt");
		int a;
		int Anum = 0;
		int anum = 0;
		while (-1 != (a = in.read())) {
			if ((char) a == 'A') {
				Anum++;
			}
			if ((char) a == 'a') {
				anum++;
			}
		}
		System.out.println(Anum + "---------" + anum);
	}
}
