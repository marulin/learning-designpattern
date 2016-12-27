package com.xianglesong.designpattern.builder;

public abstract class AbstractProduct {
	protected abstract void part01();

	protected abstract void part02();

	protected abstract void part03();

	// 模板方法给出了默认的组装方式，生成默认的产品
	public final AbstractProduct defaultProduct() {
		part01();
		part02();
		part03();
		return this;// 返回当前对象，即默认组装方式的产品
	}
}
