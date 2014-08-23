package patterns.creation.buidler;

public class BuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();

		Builder builder = new Builder1(); // ����������1
		Product product = director.construct(builder); // ���ý�����1��������
		System.out.println(product); // ��ӡ����
		System.out.println();

		builder = new Builder2(); // ����������2
		product = new Director().construct(builder); // ���ý�����2��������
		System.out.println(product); // ��ӡ����
	}

}
