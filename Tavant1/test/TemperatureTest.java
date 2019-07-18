package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		double act=Temperature.convertToCelcius(101);
		double exp=38.333333333333336;
		assertEquals(act,exp);
		
		double actu=Temperature.convertToFarenheit(202);
		double expt=395.59999999999997;
		assertEquals(actu,expt);
		
		
		
		
	}

}
