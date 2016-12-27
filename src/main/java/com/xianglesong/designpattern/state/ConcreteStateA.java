package com.xianglesong.designpattern.state;

public class ConcreteStateA implements State {

	public void handle(Context context) {
		System.out.println("当前状态A。");
		// context
		context.setState(new ConcreteStateB());
	}

}
