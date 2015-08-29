/**
 * 
 */
package com.centurylink.ekk.codingchallenge;

import java.util.ArrayList;

/**
 * @author Erin
 *
 */
public class Manager {

	final static int ALLOC = 300;//managers get $500 for Managers who report to them
	
	//lists of employees used to determine allocation 
	private ArrayList<Manager> managers;
	private ArrayList<Developer> developers;
	private ArrayList<QATester> qatesters;
	
	private int allocation;
	
	/**
	 * 
	 */
	public Manager() {
		//  Auto-generated constructor stub
		managers  = new ArrayList<Manager>();
		developers  = new ArrayList<Developer>();
		qatesters = new ArrayList<QATester>();
	}
	
	/**
	 * @return the managers
	 */
	public ArrayList<Manager> getManagers() {
		return managers;
	}
	
	/**
	 * @param managers the managers to set
	 */
	public void setManagers(ArrayList<Manager> managers) {
		this.managers = managers;
	}
	
	public void addManager(Manager m) {
		managers.add(m);
	}
	
	/**
	 * @return the developers
	 */
	public ArrayList<Developer> getDevelopers() {
		return developers;
	}
	
	/**
	 * @param developers the developers to set
	 */
	public void setDevelopers(ArrayList<Developer> developers) {
		this.developers = developers;
	}
	
	public void addDeveloper(Developer d) {
		developers.add(d);
	}
	
	/**
	 * @return the qatesters
	 */
	public ArrayList<QATester> getQatesters() {
		return qatesters;
	}
	
	/**
	 * @param qatesters the qatesters to set
	 */
	public void setQatesters(ArrayList<QATester> qatesters) {
		this.qatesters = qatesters;
	}
	
	public void addQATester(QATester t) {
		qatesters.add(t);
	}

	/**
	 * @return the allocation
	 */
	public int getAllocation() {
		return allocation;
	}

	/**
	 * @param allocation the allocation to set
	 */
	public void setAllocation(int allocation) {
		this.allocation = allocation;
	}
	
	public void calculateAllocation() {
		allocation = 0;
		//allocation += managers.size() * Manager.ALLOC;  This was double counting the amount for each manager
		allocation += developers.size() * Developer.ALLOC;
		allocation += qatesters.size() * QATester.ALLOC;
		allocation += ALLOC;//gets additional allocation for self according to example scenario
		
		for (Manager m : managers) {
			m.calculateAllocation();
			allocation += m.getAllocation();
		}
	}
}