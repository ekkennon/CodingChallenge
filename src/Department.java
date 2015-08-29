/**
 * 
 */
package com.centurylink.ekk.codingchallenge;

/**
 * @author Erin
 *
 */
public class Department {

	Manager inCharge;
	
	/**
	 * @return the inCharge
	 */
	public Manager getInCharge() {
		return inCharge;
	}
	
	/**
	 * @param inCharge the inCharge to set
	 */
	public void setInCharge(Manager inCharge) {
		this.inCharge = inCharge;
	}
	
	/**
	 * 
	 */
	public Department() {
		//  Auto-generated constructor stub
		inCharge = new Manager();
	}
	
	public int calculateAllocation() {
		getInCharge().calculateAllocation();
		return getInCharge().getAllocation();
	}
}