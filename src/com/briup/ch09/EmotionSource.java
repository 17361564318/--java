package com.briup.ch09;

import java.util.ArrayList;
import java.util.List;

//事件源
//相当于例子中的女孩，产生事件的源头
public class EmotionSource {

	private String name;
	// 一个事件源可以由多个监听器监听
	private List<EmotionListener> list = new ArrayList<EmotionListener>();

	public EmotionSource() {
	}

	public EmotionSource(String name) {
		this.name = name;
	}

	public void addEmotionListener(EmotionListener listener) {
		list.add(listener);
	}

	public void removeEmotionListener(EmotionListener listener) {
		list.remove(listener);
	}

	public void happy() {
		// 产生高兴的事件对象
		EmotionObject event = new EmotionObject("高兴", "今天星期五", this);
		System.out.println("我是" + name + ",我很高兴，我要通知boy");
		tellAllListener(event);
	}

	private void tellAllListener(EmotionObject event) {
		// 让当前监听此事件源的所有监听器，处理这个事件
		for (EmotionListener listener : list) {
			listener.doSomething(event);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
