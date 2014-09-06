package patterns.behavior.command;
/**
 * Client test for command design pattern
 * @author Charles Chen
 * @date 2014��9��6��
 */
public class ClientTest {
	public static void main(String[]args){
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
