package com.briup.homework2;

//继承Thread类，作用为往Storage对象中依次保存0~99的数据(每次覆盖)
public class Counter extends Thread {
	Storage s1;

	public Counter(Storage s) {
		this.s1 = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (s1) {
				while (!s1.isFlag())
					try {
						s1.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				s1.setA(i);
				System.out.println("生产出 " + s1.getA());
				s1.setFlag(false);
				s1.notify();

			}
		}
	}
}