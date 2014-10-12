package patterns.behavior.state.sample;

/**
 * Buyer interface
 * 
 * @author Charles Chen
 * @date 2014��10��12��
 */
public interface Buyer {
	void order(OrderManager mgr, OrderRecord record);
}
