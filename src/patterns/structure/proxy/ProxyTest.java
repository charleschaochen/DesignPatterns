package patterns.structure.proxy;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create proxy for soldier
		// Soldier proxy = new SoldierProxy(new SoldierImpl());
		SoldierProxyHandler handler = new SoldierProxyHandler(new SoldierImpl());
		Soldier proxy = handler.getProxy();
		// Invoke methods
		proxy.doMission();
		proxy.train();
	}

}
