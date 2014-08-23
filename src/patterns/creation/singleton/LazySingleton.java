package patterns.creation.singleton;

/**
 * ��ͨ������Ҳ��������ʽ������֤�̰߳�ȫ
 * 
 * @author Charles Chen
 * 
 */
public class LazySingleton {
	private LazySingleton() {
	}

	private static LazySingleton singleton;

	/**
	 * Get instance
	 * 
	 * @return
	 */
	public static LazySingleton getInstance() {
		if (singleton == null) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
