package patterns.behavior.mediator;

/**
 * Colleague interface
 * 
 * @author Charles Chen
 * @date 2014��9��26��
 */
public interface Colleague {
	void send(String message);

	void receive(String message);
}
