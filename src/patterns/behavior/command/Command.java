package patterns.behavior.command;

/**
 * Abstract command
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public abstract class Command {
	protected Receiver receiver;

	public Command(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void execute();
}
