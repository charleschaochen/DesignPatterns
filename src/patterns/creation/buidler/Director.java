package patterns.creation.buidler;

/**
 * ָ������
 * 
 * @author Charles Chen
 * 
 */
public class Director {
	/**
	 * ��ϴ���Ľ����ߵĹ��첽�裬���ض���ʵ��
	 * 
	 * @param builder
	 * @return
	 */
	public Product construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.build();
	}
}
