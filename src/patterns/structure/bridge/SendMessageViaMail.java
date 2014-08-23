package patterns.structure.bridge;

/**
 * �ʼ���ʽ������Ϣ
 * 
 * @author Charles Chen
 * 
 */
public class SendMessageViaMail extends SendMessage {
	public SendMessageViaMail(Message message) {
		this.message = message;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send message via email");
		message.send();
	}

}
