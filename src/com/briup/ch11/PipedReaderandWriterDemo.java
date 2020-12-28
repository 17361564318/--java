package com.briup.ch11;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PipedReader;
import java.io.Reader;
import java.io.Writer;

public class PipedReaderandWriterDemo {
	public static void main(String[] args) {
		try {
			PipedReader in = new PipedReader();
			PipedWriter out = new PipedWriter(in);

			Thread write = new WriterThread(out);
			Thread read = new ReaderThread(in);

			write.start();
			read.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class WriterThread extends Thread {
	private Writer out;

	public WriterThread(Writer out) {
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

class ReaderThread extends Thread {
	private Reader in;

	public ReaderThread(Reader in) {
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