package patterns.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态代理调用处理器，封装代理的添加逻辑
 * 
 * @author Charles Chen
 * 
 */
public class SoldierProxyHandler implements InvocationHandler {
	private Soldier soldier;

	public SoldierProxyHandler(Soldier soldier) {
		this.soldier = soldier;
	}

	/**
	 * 获取动态生成的代理类实例
	 * 
	 * @return
	 */
	public Soldier getProxy() {
		return (Soldier) Proxy.newProxyInstance(soldier.getClass()
				.getClassLoader(), soldier.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Start time: "
				+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
		method.invoke(soldier, null);
		System.out.println("Start time: "
				+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
		return null;
	}

}
