package com.xianglesong.designpattern.visitor;

public class Client {
	private static ObjectStructure aObjects;
	private static Visitor visitor;

	static public void main(String[] args) {
		aObjects = new ObjectStructure();

		aObjects.add(new ConcreteElementA());
		aObjects.add(new ConcreteElementB());

		visitor = new VisitorA();
		aObjects.action(visitor);
	}
}