/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose E. Ramos
 *
 */
public class Sensor {
	
	@SuppressWarnings("unused")
	private int sensorType = 0;
	private int sensorID = 0;

	/**
	 * @return the sensorType
	 */
	public String getSensorType() {
		return "Zero";
	}

	/**
	 * @param sensorType the sensorType to set
	 */
	public void setSensorType(int sensorType) {
		this.sensorType = sensorType;
	}

	/**
	 * @return the sensorID
	 */
	public int getSensorID() {
		return sensorID;
	}

	/**
	 * @param sensorID the sensorID to set
	 */
	public void setSensorID(int sensorID) {
		this.sensorID = sensorID;
	}
	
}
