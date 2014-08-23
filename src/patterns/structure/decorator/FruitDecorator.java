package patterns.structure.decorator;

/**
 * 水果装饰器类，添加水果原料
 * 
 * @author Charles Chen
 * 
 */
public class FruitDecorator implements Pizza {
	private Pizza pizza;

	public FruitDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		pizza.make();
		System.out.println("添加原料： 水果");
	}

}
