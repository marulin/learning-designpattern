package com.xianglesong.designpattern.memento;

/**
 * 负责备忘录，不能对备忘录的内容进行访问或者操作。
 * 
 * @author rollin
 *
 */
public class Caretaker {
	/**
	 * @link aggregation
	 * @label narrow
	 */
	private Memento memento;

	public Memento retrieveMemento() {
		return this.memento;
	}

	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
}
