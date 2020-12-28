package com.briup.ch06;
@SuppressWarnings("all")
public /* abstract */ interface Action {
	
	public static final int A = 1;//int A =1;同等效果
	
	public abstract void test() ;//void test();
}
interface ActionX{
	void run();
} 
interface ActionY{
	void go();
}
interface ActionZ extends Action,ActionY,ActionX{   
	
}
class ActionImpl implements ActionZ{
	public static void main(String[] args) {
		ActionImpl t =new ActionImpl();
		Action a = new ActionImpl();
		ActionX a1 = new ActionImpl();
		ActionY a2 = new ActionImpl();
		ActionZ a3  = t;
		a.test();
		a1.run();
		a2.go();
		System.out.println(t instanceof Action);
		t.go();
		t.test();
		t.run();
		System.out.println(Action.A);
	}
	@Override
	public void test() {
		System.out.println("hello");
	}
	@Override
	public void run() {
		System.out.println("run..");
	}
	@Override
	public void go() {
		System.out.println("go..");
	}
}