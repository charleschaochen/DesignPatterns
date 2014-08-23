package patterns.creation.buidler;

public class BuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();

		Builder builder = new Builder1(); // 创建建造者1
		Product product = director.construct(builder); // 利用建造者1构建对象
		System.out.println(product); // 打印对象
		System.out.println();

		builder = new Builder2(); // 创建建造者2
		product = new Director().construct(builder); // 利用建造者2构建对象
		System.out.println(product); // 打印对象
	}

}
