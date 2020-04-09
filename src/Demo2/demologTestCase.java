package Demo2;

import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class demologTestCase {
	private static final Logger logmsg = LogManager.getLogger(demologTestCase.class.getName());
	
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
