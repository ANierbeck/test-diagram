package test;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.junit4.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RouteTest extends CamelSpringTestSupport {

	@Produce(uri = "direct:start")
	protected ProducerTemplate template;

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/camel-context.xml");
	}


	@Test
	public void testRoute() throws Exception {
		template.sendBody("Testme");
	}

}
