/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class Camera implements edu.fiu.sysdesign.SelfCheckCapable {
	
	public String status() {
		return getComponentName() + " - Say Cheese!\n";
	}

	public boolean isItDark() {
		return false;
	}
	
	public String getComponentName() {
		return "99376: Camera";
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
