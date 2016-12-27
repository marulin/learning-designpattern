package com.xianglesong.designpattern.memento;

/**
 * 发起人(Originator):
 * 负责创建一个备忘录Memento,用以记录当前时刻自身的内部状态，并可使用备忘录恢复内部状态。发起人可以根据需要觉得备忘录存储自己的哪些内部状态。
 * 
 * @author rollin
 *
 */
public class Originator {
	private String state;

	public Memento createMemento() {
		return new Memento(state);
	}

	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Current state = " + this.state);
	}
}
