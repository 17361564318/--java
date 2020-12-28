package com.briup.ch11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		Reader in = null;
		BufferedReader br = null;
		try {
			String filepath = "src/com/briup/ch11/a.txt";
			in = new FileReader(filepath);

			br = new BufferedReader(in);
			long start = System.currentTimeMillis();

////			
//int data = -1;
//			while((data=br.read())!=-1) { 
//				
//			}
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			long end = System.currentTimeMillis();
			System.out.println("耗时：" + (end - start) + "minseconds毫秒");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.关闭流
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
