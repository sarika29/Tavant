package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		
		int num=Factorial.calculateFactorial(7);
		int exp=120;
		assertEquals(num,exp);
	}

}
