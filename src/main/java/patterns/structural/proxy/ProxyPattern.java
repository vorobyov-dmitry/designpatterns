package patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPattern implements InvocationHandler{
	public  static final String ROAR = " It is proxy ";
	Bear bearProxy  = (Bear) Proxy.newProxyInstance(Bear.class.getClassLoader(), new Class<?>[]{Bear.class}, this);


	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		return ROAR;
	}


	public Bear getBearProxy() {
		return bearProxy;
	}
	
}
