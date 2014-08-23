package patterns.structure.bridge;

/**
 * 警告消息类型
 * 
 * @author Charles Chen
 * 
 */
public class WarningMessage implements Message {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Message Type: Warning Message");
	}

}
