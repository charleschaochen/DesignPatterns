package patterns.behavior.command.sample;

import java.util.Stack;

/**
 * Command for turning on TV
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public class TurnOnCommand extends Command {
	public TurnOnCommand(Television tv) {
		// TODO Auto-generated constructor stub
		super(tv);
	}

	@Override
	public void execute(Stack<Command> history) {
		// TODO Auto-generated method stub
		if (tv != null && history != null) {
			tv.changeTurnOn(true);
			// Push current command into histories
			history.push(this);
		}
	}

	@Override
	public void undo(Stack<Command> history) {
		// TODO Auto-generated method stub
		if (history != null & history.size() > 0
				&& history.lastElement() == this) {
			// Pop last executed command
			history.pop();
			tv.changeTurnOn(false);
		}
	}
}
