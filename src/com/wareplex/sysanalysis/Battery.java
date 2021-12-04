/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class Battery implements edu.fiu.sysdesign.SelfCheckCapable {
	
	public String status() {
		return getComponentName() + " - Power at 100%!\n";
	}
	
	public float voltage() {
		return (float) 0.0;
	}
	
	public String getComponentName() {
		return "27545: Battery";
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
