package com.briup.homework2;

public class Timer extends Thread {
	private int delay;
	private ActionListener listener;
	private boolean flag = true;

	public Timer(int delay, ActionListener listener) {
		this.delay = delay;
		this.listener = listener;
	}

	@Override
	public void run() {
		int a = 0;
		while (flag) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(++a + "秒");
			if (a % 3 == 0)
				listener.actionPerformed();

			if (a == delay)
				stopp();
		}
	}

	public void start() {
		super.start();
	}

	public void stopp() {
		this.flag = false;
	}

	public void setDelay(int dalay) {
		this.delay = delay;
	}

}
