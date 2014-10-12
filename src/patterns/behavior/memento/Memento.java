package patterns.behavior.memento;

/**
 * Memento for saving state of Originator
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ13ÈÕ
 */
public class Memento {
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
