package com.xianglesong.designpattern.singleton.lazy;

import junit.framework.TestCase;

public class SingletonTest extends TestCase {

	/**
	 * 检测是否自身实例化并唯一。
	 */
	public void testGetInstance() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		assertEquals(true, s1 == s2);
	}
}
