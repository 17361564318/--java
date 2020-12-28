package com.briup.ch10;

@SuppressWarnings("all")
public class ThreadDemo7 {
	// 就绪状态，不会抛出异常，但是被打断线程对象中的一个boolean类型的变量（一个标记），会被设置为true，通过这个
	// 信息，就告诉了t线程，在其他线程中调用了t·interrupt（）方法去打断他。
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread("t线程") {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();

				for (int i = 0; i < 10; i++) {
					// 返回后标记值不会改变
					// System.out.println(name + ": 检查是否有别的线程调用interrupt方法 "+this.isInterrupted());
					// 返回后标记值会改变，第一个为true，以后的为false
					System.out.println(name + ": 检查是否有别的线程调用interrupt方法  :" + Thread.interrupted());
				}
				try {
					Thread.sleep(10000);
					System.out.println(name + " : 自然醒");
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println(name + " : 被打断");
				}
				System.out.println(name + ": 阻塞被打断后查看flag标示  :" + this.isInterrupted());
			}
		};

		t.start();
		// Thread.sleep(1);
		t.interrupt();

	}
}