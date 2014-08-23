package patterns.structure.adapter;

/**
 * 手机类，具有通话和拍照接口
 * 
 * @author Charles Chen
 * 
 */
public class Cellphone {
	public void call() {
		System.out.println("Call someone using cellphone");
	}

	public void photoByPhone() {
		System.out.println("Take photos using cellphone");
	}
}
