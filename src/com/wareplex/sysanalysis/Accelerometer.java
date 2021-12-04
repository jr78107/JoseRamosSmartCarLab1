/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class Accelerometer implements edu.fiu.sysdesign.SelfCheckCapable {
	
	private int velocity = 0;
	
	public String status() {
		return getComponentName() + " - I have a need for speed!\n";
	}

	public boolean moving() {
		return true;
	}

	/**
	 * @return the velocity
	 */
	public int getVelocity() {
		return velocity;
	}
	
	public String getComponentName() {
		return "12385: Accelerometer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void Backup() {
		
	}
	
	public void InstallUpdates() {
		
	}
	
	public void RollbackUpdates() {
		
	}
	
}
