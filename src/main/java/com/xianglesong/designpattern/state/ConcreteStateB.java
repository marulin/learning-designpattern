package com.xianglesong.designpattern.state;

public class ConcreteStateB implements State {

	public void handle(Context context) {
		System.out.println("当前状态B。");
		context.setState(new ConcreteStateA());
	}

}
