package patterns.structure.bridge;

/**
 * 任务消息类型
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
