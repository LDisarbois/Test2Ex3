package Ex3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComputeTest {

	RomanAdditioner RA = new RomanAdditioner();
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void computetest() {
		assertEquals(new String("MMCMXLIII"), RA.compute(new String("MMMXL+XII-CIX")));
	}

}
