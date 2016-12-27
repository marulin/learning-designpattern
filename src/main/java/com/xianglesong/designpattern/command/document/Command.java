package com.xianglesong.designpattern.command.document;

/**
 * 命令模式：
 * 
 * 定义：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；</br> 对请求排队或记录请求日志，以及支持可撤销的操作。
 * 主要应用于将<font>行为调用者<font>与</font>实现者</font>解耦。
 * 
 * 命令模式的优点： </br>
 * （1）命令模式将行为调用者和各种行为分隔开，降低程序的耦合，便于程序扩展。</br>
 * （2）命令模式将行为的具体实现封装起来，客户端无需关心行为的具体实现。</br>
 * （3）命令模式可为多种行为提供统一的调用入口，便于程序对行为的管理和控制。</br>
 *
 * 抽象命令，包含命令执行的抽象方法
 * 
 * @author rollin
 *
 */
public interface Command {
	public void execute();
}
