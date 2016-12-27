package com.xianglesong.designpattern.builder;

public class Client {
	public static void main(String[] args) {
		// System.out.println("利用模板方法模式获得默认的产品A");
		// AbstractProduct defualtProductA = new ConcreteProductA()
		// .defaultProduct();

		System.out.println("利用Director类获得不同组装方式的产品A");
		Director director = new Director();
		director.getProductA();

		System.out.println("利用Director类获得不同组装方式的产品B");
		director.getProductB();
	}
}
