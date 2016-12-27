package com.xianglesong.designpattern.command.document;

/**
 * 命令接收者角色，它包含所有命令的具体行为实现方法
 * 
 * @author rollin
 *
 */
public class Receiver {
	/**
	 * 操作实体对象
	 */
	public StringBuffer sbr = new StringBuffer();

	/**
	 * 计数器
	 */
	public int count = 0;

	/**
	 * 撤销实现方法
	 */
	public void undo() {
		System.out.println("调用撤销实现方法，字符串递减");
		this.sbr.deleteCharAt(sbr.length() - 1);
		this.count--;
		System.out.println("当前文本为：" + sbr.toString());
	}

	/**
	 * 恢复实现方法
	 */
	public void redo() {
		System.out.println("调用恢复实现方法，字符串递加");
		this.sbr.append(count);
		this.count++;
		System.out.println("当前文本为：" + sbr.toString());
	}

	/**
	 * 执行实现方法
	 */
	public void add() {
		System.out.println("调用执行实现方法，字符串递加");
		this.sbr.append(count);
		this.count++;
		System.out.println("当前文本为：" + sbr.toString());
	}
}
