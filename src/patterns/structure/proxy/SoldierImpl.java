package patterns.structure.proxy;

import java.util.concurrent.TimeUnit;

/**
 * 士兵实现类
 * 
 * @author Charles Chen
 * 
 */
public class SoldierImpl implements Soldier {

	@Override
	public void doMission() {
		// TODO Auto-generated method stub
		System.out.println("Soldier is doing mission...");
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("Soldier is training...");
		try {
			TimeUnit.MILLISECONDS.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
