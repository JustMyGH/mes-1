package com.wdxxl.mes.qm.test;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.wdxxl.mes.qm.IQMsay;

public class QMIsayTestCase {
	public static void main(String[] args) throws MalformedURLException  {
		//Spring Hessian proxy Servlet
		String url = "http://localhost:8080/wdxxl-web/remote/helloQM";
		HessianProxyFactory factory = new HessianProxyFactory();
		IQMsay api = (IQMsay) factory.create(IQMsay.class, url);

		System.out.println(api.sayHello("Mes QM", " King"));
	}
}