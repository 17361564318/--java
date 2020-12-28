package com.briup.homework1;

public class Duration {
	private int hours;
	private int minutes;
	private int seconds;

	public Duration() {
		// TODO Auto-generated constructor stub
	}

	public Duration(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Duration(int s) throws Exception {
		if (s >= 0) {
			hours = s / (60 * 60);
			s = s - hours * 60 * 60;
			minutes = s / 60;
			s = s - minutes * 60;
			seconds = s;
		} else {
			throw new Exception("请输入正确的秒数");
		}
	}

	@Override
	public String toString() {
		return "Duration [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getTotalSeconds() {
		return hours * 3600 + minutes * 60 + seconds;

	}
}
