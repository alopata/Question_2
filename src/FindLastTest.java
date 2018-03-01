import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindLastTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("preparing test...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("test complete.");
	}

	@Test
	public void testFindLast() {
		int[] x = {1, 2, 3, 4, 5, 2};
		int y = 2;
		
		assertTrue(FindLast.findLast(x, y) == 5);
	}

}
