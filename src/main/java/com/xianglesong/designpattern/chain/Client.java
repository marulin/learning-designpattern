package com.xianglesong.designpattern.chain;

public class Client {
	public static void main(String[] args) {
		// 组装责任链
		Handler handlerA = new ConcreteHandlerA();
		Handler handlerB = new ConcreteHandlerB();
		handlerA.setSuccessor(handlerB);
		// 提交请求
		handlerA.handleRequest(10);
		System.out.println("继续测试：");
		handlerA.handleRequest(20);
	}
}
