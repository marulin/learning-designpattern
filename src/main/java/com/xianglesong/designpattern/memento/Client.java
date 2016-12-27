package com.xianglesong.designpattern.memento;

public class Client {

	// 发起人(Originator):
	// 负责创建一个备忘录Memento,用以记录当前时刻自身的内部状态，并可使用备忘录恢复内部状态。发起人可以根据需要觉得备忘录存储自己的哪些内部状态。
	private static Originator o = new Originator();

	private static Caretaker c = new Caretaker();

	public static void main(String[] args) {
		o.setState("On");

		// Store internal state
		c.saveMemento(o.createMemento());
		System.out.println(o.getState());

		// Continue changing originator
		o.setState("Off");
		System.out.println(o.getState());

		// Restore saved state
		o.restoreMemento(c.retrieveMemento());
		System.out.println(o.getState());
	}
}
