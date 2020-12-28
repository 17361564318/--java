package com.briup.ch11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedDemo {
	public static void main(String[] args) {
		try {
			PipedInputStream in = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream(in);

			Thread write = new WriteThread(out);
			Thread read = new ReadThread(in);

			write.start();
			read.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class WriteThread extends Thread {
	private OutputStream out;

	public WriteThread(OutputStream out) {
		this.out = out;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int data = (int) (Math.random() * 26 + 97);
				out.write(data);
				out.flush();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if (out != null)
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}

class ReadThread extends Thread {
	private InputStream in;

	public ReadThread(InputStream in) {
		this.in = in;
	}

	@Override
	public void run() {
		try {
			int data = -1;
			while ((data = in.read()) != -1) {
				System.out.write(data);
				System.out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			if (in != null)
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}