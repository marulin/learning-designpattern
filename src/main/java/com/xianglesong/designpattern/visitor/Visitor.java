package com.xianglesong.designpattern.visitor;

public interface Visitor {
	void visit(ConcreteElementA node);

	void visit(ConcreteElementB node);
}
