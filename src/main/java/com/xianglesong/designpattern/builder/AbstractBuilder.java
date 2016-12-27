package com.xianglesong.designpattern.builder;

public abstract class AbstractBuilder {
	public abstract void buildPart();

	public abstract AbstractProduct buildProduct();
}