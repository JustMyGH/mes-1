package com.wdxxl.mes.pp.test;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.wdxxl.mes.qm.IPPsay;

public class PPIsayTestCase {
	public static void main(String[] args) throws MalformedURLException  {
		//Spring Hessian proxy Servlet
		String url = "http://localhost:8080/wdxxl-web/remote/helloPP";
		HessianProxyFactory factory = new HessianProxyFactory();
		IPPsay api = (IPPsay) factory.create(IPPsay.class, url);

		System.out.println(api.sayHello("Mes PP", " King"));
	}
}