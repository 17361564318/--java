package com.briup.ch12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerTest {

	public static void main(String[] args) {

		int port = 9999;

		ServerSocket server = null;
		Socket client = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			server = new ServerSocket(port);

			System.out.println("服务器端已经启动，监听端口" + port + "，正在等待客户端的连接");
			client = server.accept();
			System.out.println("接收到客户端的连接：client=" + client);

			br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			pw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));

			pw.println("请输入你的昵称:\t");
			pw.flush();

			String name = br.readLine();

			String msg = null;
			while ((msg = br.readLine()) != null) {
				if ("bye".equals(msg)) {
					pw.println("走好，不送！");
					pw.flush();
					break;
				}
				pw.println(name + ": " + msg);
				pw.flush();
			}

		} catch (IOException e) {
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
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (client != null)
					client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
