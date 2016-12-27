package com.xianglesong.designpattern.proxy;

public class Client {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
