package patterns.structure.decorator;

/**
 * ���װ�����࣬������ԭ��
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
		System.out.println("���ԭ�ϣ� ���");
	}

}
