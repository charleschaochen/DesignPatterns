package patterns.structure.bridge;
/**
 * 短信方式发送消息
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
