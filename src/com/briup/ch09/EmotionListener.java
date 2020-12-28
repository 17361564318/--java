package com.briup.ch09;

//监听器
//相当于例子中的boy
public interface EmotionListener {
	// event参数 表示监听器当前要处理的事件是什么
	void doSomething(EmotionObject event);
}
