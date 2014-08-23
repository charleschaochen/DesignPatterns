package patterns.creation.buidler;
/**
 * 建造者接口
 * @author Charles Chen
 *
 */
public interface Builder {
	void buildPartA();

	void buildPartB();

	void buildPartC();

	Product build();
}
