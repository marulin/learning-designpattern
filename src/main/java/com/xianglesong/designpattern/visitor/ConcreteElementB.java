package com.xianglesong.designpattern.visitor;

public class ConcreteElementB extends Element {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String operationB() {
		return "NodeB is visited";
	}
}
