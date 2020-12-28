package com.briup.homework1;

public class Track {
//	String类型属性title、Duration类型属性duration
//
//	2.对每个属性提供get和set方法
//
//	3.toString()方法，代码为return "my Track title is: " + title + " duration is: " + duration;
	private String title;
	private Duration duration;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Track [title=" + title + ", duration=" + duration + "]";
	}
	

}
