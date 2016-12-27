package com.xianglesong.designpattern.command.document;

/**
 * 客户端调用
 * 
 * @author rollin
 *
 */
public class Client {
	public static void assemble() {
		Receiver receiver = new Receiver();
		Command addCommand = new AddCommand(receiver);
		Command redoCommand = new RedoCommand(receiver);
		Command undoCommand = new UndoCommand(receiver);

		// reflact
		Invoker invoker = new Invoker();
		invoker.addCommand(addCommand);
		invoker.addCommand(addCommand);
		invoker.addCommand(undoCommand);
		invoker.addCommand(redoCommand);
		invoker.action();
	}

	public static void main(final String[] args) {
		assemble();
	}
}
