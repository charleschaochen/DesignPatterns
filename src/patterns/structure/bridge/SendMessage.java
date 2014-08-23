package patterns.structure.bridge;

/**
 * 消息发送方式接口
 * 
 * @author Charles Chen
 * 
 */
public abstract class SendMessage {
	protected Message message;

	abstract void sendMessage();
}
