package patterns.structure.decorator;

/**
 * ţ��װ�����࣬���ţ��ԭ��
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
		System.out.println("���ԭ�ϣ� ţ��");
	}

}
