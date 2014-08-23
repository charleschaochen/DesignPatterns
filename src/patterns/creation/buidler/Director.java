package patterns.creation.buidler;

/**
 * 指导者类
 * 
 * @author Charles Chen
 * 
 */
public class Director {
	/**
	 * 组合传入的建造者的构造步骤，返回对象实例
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
