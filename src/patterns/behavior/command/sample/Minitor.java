package patterns.behavior.command.sample;

import java.util.Stack;

/**
 * TV monitor POJO
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public class Minitor {
	private Stack<Command> history; // Command histories
	private Command cmd;

	public Minitor(Command cmd) {
		// TODO Auto-generated constructor stub
		history = new Stack<Command>();
		this.cmd = cmd;
	}

	/**
	 * Execute command for TV
	 */
	public void action() {
		if (cmd != null) {
			cmd.execute(history);
		}
	}

	/**
	 * Undo the command
	 */
	public void undo() {
		if (cmd != null) {
			cmd.undo(history);
		}
	}

	public Command getCmd() {
		return cmd;
	}

	public void setCmd(Command cmd) {
		this.cmd = cmd;
	}

}
