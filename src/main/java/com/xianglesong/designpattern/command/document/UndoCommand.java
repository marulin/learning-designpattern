package com.xianglesong.designpattern.command.document;

/**
 * 它包含一个命令接收者对象，并调用接收者的对象相应实现方法。
 * 
 * @author rollin
 *
 */
public class UndoCommand implements Command {
	private Receiver receive = null;

	public UndoCommand(final Receiver receive) {
		this.receive = receive;
	}

	public void execute() {
		this.receive.redo();
	}

}