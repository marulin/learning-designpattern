package com.xianglesong.designpattern.state;

public class Client {

	public static void main(String[] args) {
		Context context = new Context(new ConcreteStateA());

		// 不断地进行请求，同时更改状态
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
