package patterns.structure.bridge;

/**
 * 测试程序
 * 
 * @author Charles Chen
 * 
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 短信方式发送通知消息
		Message mess = new NoticeMessage();
		SendMessage sm = new SendMessageViaSms(mess);
		sm.sendMessage();
		
		// 邮件方式发送任务消息
		mess = new TaskMessage();
		sm = new SendMessageViaMail(mess);
		sm.sendMessage();
	}

}
