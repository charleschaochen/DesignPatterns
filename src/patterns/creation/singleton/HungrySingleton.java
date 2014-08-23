package patterns.creation.singleton;

/**
 * ������ʽ��������������ʱ����ʵ��������֤�̰߳�ȫ����ʵ���ӳټ���
 * 
 * @author Charles Chen
 * 
 */
public class HungrySingleton {
	private HungrySingleton() {
	}

	private static HungrySingleton singleton = new HungrySingleton();

	/**
	 * Get instance
	 * 
	 * @return
	 */
	public static HungrySingleton getInstance() {
		return singleton;
	}

}
