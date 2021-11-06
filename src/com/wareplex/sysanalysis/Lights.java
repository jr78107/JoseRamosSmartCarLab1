/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class Lights {
	
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
		return "Lights - Check OK";
	}

}
