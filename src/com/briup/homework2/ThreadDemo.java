package com.briup.homework2;

//写两个线程，一个线程打印 1-52，另一个线程打印字母A-Z。打印顺序为12A34B56C……5152Z。 
public class ThreadDemo {

	public static void main(String[] args) {
		Object o = new Object();

		Thread t1 = new Thread() {
			public void run() {
				synchronized (o) {

					for (int i = 1; i <= 52; i++) {
						System.out.println(i);
						if (i % 2 == 0) {
							try {
								o.notify();
								o.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}

					}

				}
			}

		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (o) {
					for (int i = 0; i < 26; i++) {
						System.out.println((char) (65 + i));
						o.notify();
						try {
							o.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				}
			}

		};

		t1.start();

		try {
			t2.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();

	}
}
