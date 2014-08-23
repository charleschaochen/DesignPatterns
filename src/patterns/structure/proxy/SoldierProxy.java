package patterns.structure.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 士兵代理类
 * 
 * @author Charles Chen
 * 
 */
public class SoldierProxy implements Soldier {
	private Soldier soldier;

	public SoldierProxy(Soldier soldier) {
		this.soldier = soldier;
	}

	@Override
	public void doMission() {
		// TODO Auto-generated method stub
		System.out.println("Start time: "
				+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
		soldier.doMission();
		System.out.println("Start time: "
				+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("Start time: "
				+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
		soldier.train();
		System.out.println("Start time: "
				+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}

}
