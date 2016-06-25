package my.test;

import my.consumer.FirstService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value="my")
public class MyApplicationTest {
	
	private AnnotationConfigApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		 context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
	}

	@After
	public void tearDown() throws Exception {
		//context.close();
	}

	@Test
	public void test() {

		 FirstService firstService = context.getBean(FirstService.class);
	}

}
