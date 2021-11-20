package com.wareplex.sysanalysis;

public class Distance implements edu.fiu.sysdesign.SelfCheckCapable {
	
	private float distance = 0;
	private boolean isClose = false;
	
	public String status() {
		return getComponentName() + " - I can see for miles!\n";
	}

	/**
	 * @return the distance
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}

	/**
	 * @return the isClose
	 */
	public boolean getIsClose() {
		return isClose;
	}

	/**
	 * @param isClose the isClose to set
	 */
	public void setIsClose(boolean isClose) {
		this.isClose = isClose;
	}
	
	public String getComponentName() {
		return "22443: Distance Sensor";
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
