package patterns.behavior.state;

/**
 * Context
 * 
 * @author Charles Chen
 * @date 2014Äê10ÔÂ12ÈÕ
 */
public class Context {
	private State state;

	public Context(State state) {
		// TODO Auto-generated constructor stub
		this.state = state;
	}

	/**
	 * Change state
	 * 
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * Request the state
	 */
	public void request() {
		this.state.handle();
	}
}
