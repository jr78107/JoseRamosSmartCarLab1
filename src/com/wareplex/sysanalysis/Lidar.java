/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class Lidar implements edu.fiu.sysdesign.SelfCheckCapable {

	public String status() {
		return getComponentName() + " - Better than a bat!\n";
	}
	
	public long range() {
		return (long) 0.0;
	}
	
	public float getLidarData() {
		return (float) 0.0;
	}
	
	public String getComponentName() {
		return "99467: Lidar Sensor";
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
