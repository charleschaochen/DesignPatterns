package patterns.structure.bridge;

/**
 * 邮件方式发送消息
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
