package patterns.structure.decorator;

/**
 * 培根装饰器类，添加培根原料
 * 
 * @author Charles Chen
 * 
 */
public class BaconicDecorator implements Pizza {
	private Pizza pizza;

	public BaconicDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		pizza.make();
		System.out.println("添加原料： 培根");
	}

}
