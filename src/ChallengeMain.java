/**
 * 
 */
package com.centurylink.ekk.codingchallenge;

/**
 * @author Erin
 *
 */
public class ChallengeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  Auto-generated method stub

		Manager m1 = new Manager();
		Manager m2 = new Manager();
		
		m1.addManager(m2);
		
		m1.calculateAllocation();
		
		System.out.println(Integer.toString(m1.getAllocation()));
	}

}