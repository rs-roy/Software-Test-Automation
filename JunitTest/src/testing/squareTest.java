package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		MyProgram test = new MyProgram();
		int output = test.squ(5);
		assertEquals(25, output);
	}

}
