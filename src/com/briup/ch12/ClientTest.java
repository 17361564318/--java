package com.briup.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTest {
	public static void main(String[] args) {

		String host = "127.0.0.1";
		int port = 9999;

		// 这里表示 要连接的服务器端
		// Socket本身表示网络通信的一个端点
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			// 这个对象成功new出来，则说连接成功
			// 抛出异常，则说明连接失败
			socket = new Socket(host, port);

			// 这个流负责给网络连接的另一端写数据
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			pw.println("你好,请问你是谁");
			pw.flush();

			String str = br.readLine();
			System.out.println(str);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
