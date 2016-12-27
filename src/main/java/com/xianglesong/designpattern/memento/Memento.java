package com.xianglesong.designpattern.memento;

/**
 * 备忘录(Memento):
 * 负责存储发起人对象的内部状态，并可以防止发起人以外的其他对象访问备忘录。备忘录有两个接口：管理者只能看到备忘录的窄接口，他只能将备忘录传递给其他对象
 * 。发起人却可以看到备忘录的宽接口，允许它访问返回到先前状态所需要的所有数据。
 * 
 * @author rollin
 *
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
