package patterns.behavior.command;

/**
 * Concrete command
 * 
 * @author Charles Chen
 * @date 2014��9��6��
 */
public class ConcreteCommand extends Command {
	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		super(receiver);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.execute();
	}

}
