package com.briup.homework2;

//继承Thread类，作用为取出Storage对象中保存的数据并输出
public class Printer extends Thread {
	public Printer(Storage s) {
		this.s1 = s;
	}

	Storage s1;

	@Override
	public void run() {
		for (int i = 0; i <= 99; i++) {
			synchronized (s1) {
				while (s1.isFlag())
					try {
						s1.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println("打印出 " + s1.getA());
				s1.setFlag(true);
				s1.notify();
			}

		}
	}

}
