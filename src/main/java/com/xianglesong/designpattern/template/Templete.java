package com.xianglesong.designpattern.template;

public abstract class Templete {
	private void beforeOperation() {
		System.out.println("This acton before the operation!");
	}

	private void afterOperation() {
		System.out.println("This acton after the operation!");
	}

	/**
	 * 需要推迟到子类(实现类) 中执行
	 */
	protected abstract void operation();

	public void topOperation() {
		beforeOperation();

		operation();

		afterOperation();
	}
}
