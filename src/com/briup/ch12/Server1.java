package com.briup.ch12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import sun.print.resources.serviceui;

public class Server1 {
	public Server1() {
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			ServerSocket server = new ServerSocket(8888);// 建立服务器端
			Socket socket = server.accept();// 监听客户端
			// 得到该连接的输入流
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"gbk"));
			// 得到该连接的输出流
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"gbk"), true);
			// 先读后写
			String data = br.readLine();
			String[] strings = data.split("[]");
			String url = strings[1];
			String[] strings2 = url.split("[?]");
			if("login".equals(strings2[0])) {
				
			}
			System.out.println(data);// 输出到控制台
			pw.println("hello"+data);// 转发给客户端
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭读写流
				br.close();
				pw.close();
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		Server1 server = new Server1();
	}

}
