package com.xianglesong.designpattern.visitor;

public class VisitorB implements Visitor {
	public void visit(ConcreteElementA nodeA) {
		System.out.println(nodeA.operationA());
	}

	public void visit(ConcreteElementB nodeB) {
		System.out.println(nodeB.operationB());
	}
}
