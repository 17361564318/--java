package com.briup.homework2;

public class NumThread extends Thread {
//写一个线程类NumThread,run方法中日依次打印1到100的数字，没打印一次就休眠一下，休眠时间随机0到2000毫秒之间
//测试方法中创建改类的俩个线程对象，如果要实现以下效果，则run方法中该如何去编写 
//t1和t2俩个线程对象，调用start方法开启之后，谁先打印完100个数字则谁先停止，停止的时候也要让另一个线程也结束运行

	public static boolean flag = true;

	public static void main(String[] args) {

		Runnable run = new Runnable() {
			public int i;
			public int j;

			public void run() {
				String name = Thread.currentThread().getName();
				long l = (long) (Math.random() * 1);
				while (flag) {
					if (name.equals("t1线程")) {
						i++;
						System.out.println(name + " :  i的值为" + i);
						try {
							Thread.sleep(l);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						j++;
						System.out.println(name + " : j的值为" + j);
						try {
							Thread.sleep(l);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					if (i == 100 || j == 100) {
						flag = false;
					}
				}

			}
		};
		Thread t1 = new Thread(run, "t1线程");
		Thread t2 = new Thread(run, "t2线程");
		t1.start();
		t2.start();

	}
}
