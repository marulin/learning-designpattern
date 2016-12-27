package com.xianglesong.designpattern.visitor;

import java.util.Vector;
import java.util.Enumeration;

public class ObjectStructure {
	private Vector nodes;

	/**
	 * @link aggregation
	 */
	private Element node;

	public ObjectStructure() {
		nodes = new Vector();
	}

	public void action(Visitor visitor) {
		for (Enumeration e = nodes.elements(); e.hasMoreElements();) {
			node = (Element) e.nextElement();
			node.accept(visitor);
		}
	}

	public void add(Element node) {
		nodes.addElement(node);
	}
}
