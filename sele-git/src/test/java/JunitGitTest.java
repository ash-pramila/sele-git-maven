import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitGitTest {
//A simple test
	@Before
	public void setUp() throws Exception {
		System.out.println("Setup entered");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown entered");
	}

	@Test
	public void test() {
		System.out.println("Test entered");
	}

}
