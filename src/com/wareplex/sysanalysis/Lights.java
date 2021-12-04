/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class Lights implements edu.fiu.sysdesign.SelfCheckCapable {
	
	private int lightColor = 0;

	/**
	 * @return the lightColor
	 */
	public int getLightColor() {
		return lightColor;
	}

	/**
	 * @param lightColor the lightColor to set
	 */
	public void setLightColor(int lightColor) {
		this.lightColor = lightColor;
	}
	
	public void lightsOn(boolean choice) {
		
	}
	
	public void lightsBlink(boolean choice) {
		
	}
	
	public String status() {
		return getComponentName() + " - Ready to light up the road!\n";
	}
	
	public String getComponentName() {
		return "45643: Lights";
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
