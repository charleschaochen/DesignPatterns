package patterns.structure.bridge;

/**
 * ������Ϣ����
 * 
 * @author Charles Chen
 * 
 */
public class TaskMessage implements Message {

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Message Type: Task Message");
	}

}
