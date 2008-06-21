package utilities.RPClass;

import static org.junit.Assert.*;

import marauroa.common.game.RPClass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BabyDragonTestHelperTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenerateRPClasses() {
		BabyDragonTestHelper.generateRPClasses();
		assertTrue(RPClass.hasRPClass("baby_dragon"));
	}

}
