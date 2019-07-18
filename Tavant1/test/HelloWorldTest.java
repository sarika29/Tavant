package Day1;
import Day1.HelloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		
		String str=HelloWorld.getMessage();
		String exp="Hello world";
		assertEquals(exp,str);
	}

}
