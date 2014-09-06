package patterns.behavior.command.sample;

import java.util.Stack;

/**
 * Command abstract class
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public abstract class Command {
	protected Television tv;

	public Command(Television tv) {
		// TODO Auto-generated method stub
		this.tv = tv;
	}

	/**
	 * Execute the command
	 * 
	 * @param history
	 */
	public abstract void execute(Stack<Command> history);

	/**
	 * Undo the command
	 * 
	 * @param history
	 */
	public abstract void undo(Stack<Command> history);
}
