package com.briup.homework2;

/*提示：可以采用Math.random()取得0~1之间的随机数模拟比赛进程，
如总距离为100米，在随机数0~0.3之间代表兔子跑，
每次跑2米，在0.3~1之间代表乌龟跑，每次跑1米，
先跑完100米者为胜利者*/
public class RabbitAndTurtle extends Thread {
	public static boolean flag = true;// 静态，属于类,表征是否有谁先跑完
	public int num;// 非静态，互不干扰,米数

	public RabbitAndTurtle(String s) {
		super(s);
	}

	@Override
	public void run() {
		while (flag) {
			if (Math.random() <= 0.3 && getName().equals("兔子")) {
				num += 2;
				System.out.println(getName() + "跑了" + num + "米");
			}
			if (Math.random() > 0.3 && getName().equals("乌龟")) {
				num += 1;
				System.out.println(getName() + "跑了" + num + "米");
			}
			if (num == 100) {
				flag = false;
				System.out.println(getName() + "win");
			}

		}

	}
}
