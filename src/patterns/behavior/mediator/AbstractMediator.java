package patterns.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract mediator
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ26ÈÕ
 */
public abstract class AbstractMediator {
	protected List<Colleague> colleagues;

	public AbstractMediator() {
		// TODO Auto-generated constructor stub
		colleagues = new ArrayList<Colleague>();
	}

	/**
	 * Add new colleague
	 * 
	 * @param colleague
	 */
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}

	/**
	 * Remove a colleague
	 * 
	 * @param colleague
	 */
	public void removeColleague(Colleague colleague) {
		colleagues.remove(colleague);
	}

	public abstract void send(String message, Colleague colleague);
}
