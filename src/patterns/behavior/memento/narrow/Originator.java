package patterns.behavior.memento.narrow;

/**
 * Originator POJO
 * 
 * @author Charles Chen
 * @date 2014年9月13日
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
	public IMemento createMemento() {
		return new Memento(this.getState());
	}

	/**
	 * Restore memento for current object
	 * 
	 * @param memento
	 */
	public void restoreMemento(IMemento memento) {
		if (memento instanceof Memento) {
			this.setState(((Memento) memento).getState());
		}
	}

	/**
	 * Memento for saving state of orginator
	 * 
	 * @author Charles Chen
	 * @date 2014年9月13日
	 */
	private class Memento implements IMemento {
		private String state;

		public Memento(String state) {
			// TODO Auto-generated constructor stub
			this.state = state;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
	}

	public String toString() {
		return "Current state: " + this.getState();
	}
}
