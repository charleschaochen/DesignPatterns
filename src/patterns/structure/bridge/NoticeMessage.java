package patterns.structure.bridge;

/**
 * ֪ͨ��Ϣ����
 * 
 * @author Charles Chen
 * 
 */
public class NoticeMessage implements Message {
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Message Type: Notice Message");
	}
}
