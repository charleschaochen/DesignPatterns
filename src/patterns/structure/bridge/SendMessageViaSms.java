package patterns.structure.bridge;
/**
 * ���ŷ�ʽ������Ϣ
 * @author Charles
 *
 */
public class SendMessageViaSms extends SendMessage {
	public SendMessageViaSms(Message message) {
		this.message = message;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send message via SMS");
		message.send();
	}

}
