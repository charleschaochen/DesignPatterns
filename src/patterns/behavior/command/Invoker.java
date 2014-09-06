package patterns.behavior.command;

/**
 * Command invoker
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public class Invoker {
	private Command command;

	public Invoker(Command command) {
		// TODO Auto-generated constructor stub
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	/**
	 * Invoke the command
	 */
	public void action() {
		command.execute();
	}
}
