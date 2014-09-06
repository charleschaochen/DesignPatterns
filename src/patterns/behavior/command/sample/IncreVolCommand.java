package patterns.behavior.command.sample;

import java.util.Stack;

/**
 * Command for increasing the volume
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public class IncreVolCommand extends Command {
	public IncreVolCommand(Television tv) {
		// TODO Auto-generated constructor stub
		super(tv);
	}

	@Override
	public void execute(Stack<Command> history) {
		// TODO Auto-generated method stub
		if (tv != null & history != null) {
			tv.changeVol(1);
			// Push the current command into command histories
			history.push(this);
		}
	}

	@Override
	public void undo(Stack<Command> history) {
		// TODO Auto-generated method stub
		if (history != null && history.size() > 0
				&& history.lastElement() == this) {
			// Pop the last executed command
			history.pop();
			tv.changeVol(-1);
		}
	}
}
