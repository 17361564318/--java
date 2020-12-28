package com.briup.ch12;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.*;
import java.net.*;

public class Client {
	public Client() {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			Socket socket = new Socket("localhost", 8888);// 与服务器建立连接，服务器要先启
			// 得到Socket的输入与输出流
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			// 先写后读
			String name = null;
			pw.println(name + "你好");
			String data = null;
			while (true) {
				data = br.readLine();
				if (data != null)
					break;
			}
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		Client c = new Client();
	}
}
