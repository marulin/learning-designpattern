package com.xianglesong.designpattern.mediator;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		// 老板来了
		mediator.notice("boss");

		// 客户来了
		mediator.notice("client");
	}
}
