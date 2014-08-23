package patterns.structure.decorator;

/**
 * 牛肉装饰器类，添加牛肉原料
 * 
 * @author Charles Chen
 * 
 */
public class BeefDecorator implements Pizza {
	private Pizza pizza;

	public BeefDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		pizza.make();
		System.out.println("添加原料： 牛肉");
	}

}
