package com.briup.ch09;

public class EmotionTest {
	public static void main(String[] args) {
		EmotionSource girl1 = new EmotionSource("小红");
		EmotionSource girl2 = new EmotionSource("小离");

		EmotionListener boy = new EmotionListener() {

			@Override
			public void doSomething(EmotionObject event) {
				// 通过事件对象获取事件源，表示到底是那一个事件源产生的这个事件对象
				EmotionSource source = event.getSource();
				System.out.println("boy: " + source.getName() + "现在的状态：" + event.getName() + ",原因: " + event.getDesc());
			}
		};

		girl1.addEmotionListener(boy);
		girl2.addEmotionListener(boy);

		girl2.happy();
	}
}
