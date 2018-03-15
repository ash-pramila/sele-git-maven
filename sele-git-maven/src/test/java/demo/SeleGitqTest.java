package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeleGitqTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("setup executed");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown executed");
	}

	@Test
	public void test() {
		System.out.println("Test executed");
	}

}
