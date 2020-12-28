package com.briup.ch09;

//事件对象
//相当于例子中的女孩的产生的具体情感（事件）
public class EmotionObject {
	private String name;
	private String desc;// 描述
	// 关联事件源，表示到底是谁产生的事件
	private EmotionSource source;

	public EmotionObject(String name, String desc, EmotionSource source) {
		this.name = name;
		this.desc = desc;
		this.source = source;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public EmotionSource getSource() {
		return source;
	}

	public void setSource(EmotionSource source) {
		this.source = source;
	}

}
