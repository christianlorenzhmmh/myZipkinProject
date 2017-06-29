package hello;


import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import hello.Greeter;

public class GreeterTest {

	private Greeter greeter = new Greeter();

	@Test
	public void testGreeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));
	}

}
