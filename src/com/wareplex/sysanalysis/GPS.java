/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class GPS implements edu.fiu.sysdesign.SelfCheckCapable {

	private long location;
	
	public String status() {
		return getComponentName() + " - I'll never be lost!\n";
	}

	/**
	 * @return the location
	 */
	public long getLocation() {
		return location;
	}
	
	public String getComponentName() {
		return "99580: GPS Sensor";
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

}
