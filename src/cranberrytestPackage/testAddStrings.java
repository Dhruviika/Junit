package cranberrytestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		cranberryfunctions cunit = new cranberryfunctions();
		String ans = cunit.addStrings("alpha", "beta");
		assertEquals ("alphabeta", ans);
	}

}
