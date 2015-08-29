/**
 * 
 */
package com.centurylink.ekk.codingchallenge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Erin
 *
 */
public class TestManager {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.centurylink.ekk.codingchallenge.Manager#calculateAllocation()}.
	 */
	@Test
	public void testCalculateAllocation1Manager() {
		//fail("Not yet implemented");
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		
		m1.addManager(m2);
		
		m1.calculateAllocation();
		
		assertEquals("$300 for subordinate + $300 for self",600,m1.getAllocation());
	}
	
	/**
	 * Test method for {@link com.centurylink.ekk.codingchallenge.Manager#calculateAllocation()}.
	 */
	@Test
	public void testCalculateAllocation2Managers() {
		//fail("Not yet implemented");
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		Manager m3 = new Manager();
		
		m1.addManager(m2);
		m1.addManager(m3);
		
		m1.calculateAllocation();
		
		assertEquals("$600 for subordinates + $300 for self",900,m1.getAllocation());
	}
	
	/**
	 * Test method for {@link com.centurylink.ekk.codingchallenge.Manager#calculateAllocation()}.
	 */
	@Test
	public void testCalculateAllocation2Managers2Levels() {
		//fail("Not yet implemented");
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		Manager m3 = new Manager();
		
		m2.addManager(m3);
		m1.addManager(m2);
		
		m1.calculateAllocation();
		
		assertEquals("$600 for subordinates + $300 for self",900,m1.getAllocation());
	}
	
	/**
	 * Test method for {@link com.centurylink.ekk.codingchallenge.Manager#calculateAllocation()}.
	 */
	@Test
	public void testCalculateAllocation2Subordinates() {
		//fail("Not yet implemented");
		Manager m = new Manager();
		QATester t = new QATester();
		Developer d = new Developer();
		
		m.addQATester(t);
		m.addDeveloper(d);
		
		m.calculateAllocation();
		
		assertEquals("$500 for tester + $1000 for dev + $300 for self",1800,m.getAllocation());
	}
	
	/**
	 * Test method for {@link com.centurylink.ekk.codingchallenge.Manager#calculateAllocation()}.
	 */
	@Test
	public void testCalculateAllocation2Levels() {
		//fail("Not yet implemented");
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		QATester t = new QATester();
		Developer d = new Developer();
		
		m2.addQATester(t);
		m2.addDeveloper(d);
		m1.addManager(m2);
		
		m1.calculateAllocation();
		
		assertEquals("$500 for tester + $1000 for dev + $300 for manager + $300 for self",2100,m1.getAllocation());
	}
	
	/**
	 * Test method for {@link com.centurylink.ekk.codingchallenge.Manager#calculateAllocation()}.
	 */
	@Test
	public void testCalculateAllocation3Levels() {
		//fail("Not yet implemented");
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		Manager m3 = new Manager();
		QATester t1 = new QATester();
		Developer d1 = new Developer();
		QATester t2 = new QATester();
		Developer d2 = new Developer();
		
		m3.addDeveloper(d2);
		m3.addQATester(t2);
		m2.addQATester(t1);
		m2.addDeveloper(d1);
		m2.addManager(m3);
		m1.addManager(m2);
		
		m1.calculateAllocation();
		
		assertEquals("$1000 for tester + $2000 for dev + $600 for manager + $300 for self",3900,m1.getAllocation());
	}
	
	/**
	 * Test method for {@link com.centurylink.ekk.codingchallenge.Manager#calculateAllocation()}.
	 */
	@Test
	public void testCalculateAllocationDept() {
		//fail("Not yet implemented");
		Manager m1 = new Manager();
		Manager m2 = new Manager();
		Manager m3 = new Manager();
		QATester t1 = new QATester();
		Developer d1 = new Developer();
		QATester t2 = new QATester();
		Developer d2 = new Developer();
		Department dept = new Department();
		
		m3.addDeveloper(d2);
		m3.addQATester(t2);
		m2.addQATester(t1);
		m2.addDeveloper(d1);
		m2.addManager(m3);
		m1.addManager(m2);
		
		dept.setInCharge(m1);
		
		assertEquals("$1000 for tester + $2000 for dev + $600 for manager + $300 for self",3900,dept.calculateAllocation());
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}