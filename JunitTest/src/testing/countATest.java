package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		MyProgram test = new MyProgram();
		int output = test.countA("America");
		assertEquals(2, output);
	}

}
