package com.xianglesong.designpattern.chain;

public class ConcreteHandlerA extends Handler {
	/**
	 * 处理方法，调用此方法处理请求
	 */
	@Override
	public void handleRequest(int price) {
		/**
		 * 判断是否有后继的责任对象 如果有，就转发请求给后继的责任对象 如果没有，则处理请求
		 */
		if (price > 10) {
			System.out.println("放过请求A");
			getSuccessor().handleRequest(price);
		} else {
			System.out.println("处理请求A");
		}
	}
}
