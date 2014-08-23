package patterns.structure.decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OriginPizza oPizza = new OriginPizza();
		// 对oPizza进行两层装饰，制作牛肉培根披萨
		Pizza pizza = new BaconicDecorator(new BeefDecorator(oPizza));
		pizza.make();
	}

}
