package com.briup.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.baidu.com/?name=tom#N1");

			// 获取此URL的授权部分
			System.out.println("Authority = " + url.getAuthority());
			// 获取与此 URL关联协议的默认端口号
			System.out.println("Default port = " + url.getDefaultPort());
			// 获取此 URL的主机名
			System.out.println("Host = " + url.getHost());
			// 获取此 URL 的路径部分
			System.out.println("Path = " + url.getPath());
			// 获取此 URL 的端口号,如果未设置端口号,则返回 -1
			System.out.println("Port = " + url.getPort());
			// 获取此 URL 的协议名称
			System.out.println("Protocol = " + url.getProtocol());
			// 获取此 URL 的查询部分
			System.out.println("Query = " + url.getQuery());
			// 获取此 URL的锚点
			System.out.println("Ref = " + url.getRef());
			// 获取此 URL的 userInfo部分,如果没有用户信息,则返回 null
			System.out.println("User Info = " + url.getUserInfo());

			// -------模拟浏览器向此URL发生请求----------------

			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setRequestMethod("GET");
			httpConn.setRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 10.0; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0");
			Reader in = new InputStreamReader(httpConn.getInputStream());
			int data = -1;
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close
		}
	}
}
