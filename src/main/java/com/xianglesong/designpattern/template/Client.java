package com.xianglesong.designpattern.template;

public class Client {
	public static void main(String[] args) {
		Templete templete = new TempleteImpl();
		templete.topOperation();
	}
}
