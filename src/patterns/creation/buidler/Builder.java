package patterns.creation.buidler;
/**
 * �����߽ӿ�
 * @author Charles Chen
 *
 */
public interface Builder {
	void buildPartA();

	void buildPartB();

	void buildPartC();

	Product build();
}
