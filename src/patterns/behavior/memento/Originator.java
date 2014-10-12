package patterns.behavior.memento;

/**
 * Originator POJO
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ13ÈÕ
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Create memento for current object
	 * 
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(this.getState());
	}

	/**
	 * Restore memento for current object
	 * 
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
	
	public String toString() {
		return "Current state: " + this.getState();
	}
}
