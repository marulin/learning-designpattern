package com.xianglesong.designpattern.command.document;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供给客户端调用，接收客户端所传递的具体命令对象。
 * 
 * @author rollin
 *
 */
public class Invoker {
	private List<Command> cmdList = new ArrayList<Command>();

	public void addCommand(Command command) {
		cmdList.add(command);
	}

	public void action() {
		for (Command cmd : cmdList) {
			cmd.execute();
		}
		cmdList.clear();
	}
}