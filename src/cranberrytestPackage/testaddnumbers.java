package cranberrytestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		cranberryfunctions junit = new cranberryfunctions();
		int result = junit.addNumbers(100, 200);
		assertEquals (300,result);
	}

}
