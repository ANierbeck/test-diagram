package test;

import org.apache.camel.Handler;

public class MyBean {

	@Handler
	public void myMethod(String body) {
		System.out.println(body);
	}

}
