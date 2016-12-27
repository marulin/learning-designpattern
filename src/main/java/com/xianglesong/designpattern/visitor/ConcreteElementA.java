package com.xianglesong.designpattern.visitor;

public class ConcreteElementA extends Element
{
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    public String operationA()
    {
        return "NodeA is visited";
    }
}
