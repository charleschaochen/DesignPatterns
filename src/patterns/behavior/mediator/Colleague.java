package patterns.behavior.mediator;

/**
 * Colleague interface
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ26ÈÕ
 */
public interface Colleague {
	void send(String message);

	void receive(String message);
}
