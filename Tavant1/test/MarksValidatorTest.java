package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksValidatorTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		
		boolean act=MarksValidator.isPass(96);
		boolean exp=true;
		assertEquals(act,exp);
	}

}
