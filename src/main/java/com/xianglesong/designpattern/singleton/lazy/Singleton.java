package com.xianglesong.designpattern.singleton.lazy;

/**
 * 单例模式： 1. 一个类有且仅有一个实例, 2. 自行创建该实例， 3. 并且自行向整个系统提供。
 * 
 * @author rollin
 *
 */
public final class Singleton {

	/**
	 * 懒汉式
	 */
	private static Singleton instance = null;

	/**
	 * 阻止new实例化
	 */
	private Singleton() {
	}

	/**
	 * 通过该方法获得实例对象，使用同步防止创建多个对象。
	 * 
	 * @return instance实例
	 */
	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
}
