package patterns.structure.bridge;

/**
 * ���Գ���
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
		// ���ŷ�ʽ����֪ͨ��Ϣ
		Message mess = new NoticeMessage();
		SendMessage sm = new SendMessageViaSms(mess);
		sm.sendMessage();
		
		// �ʼ���ʽ����������Ϣ
		mess = new TaskMessage();
		sm = new SendMessageViaMail(mess);
		sm.sendMessage();
	}

}
