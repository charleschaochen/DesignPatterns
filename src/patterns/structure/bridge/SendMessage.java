package patterns.structure.bridge;

/**
 * ��Ϣ���ͷ�ʽ�ӿ�
 * 
 * @author Charles Chen
 * 
 */
public abstract class SendMessage {
	protected Message message;

	abstract void sendMessage();
}
