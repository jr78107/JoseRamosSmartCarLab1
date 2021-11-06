/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class ComponentInfo {
	
	private String compModel;
	private String compVersion;
	private String compType;
	private boolean isEnabled;
	
	/**
	 * @return the compModel
	 */
	public String getCompModel() {
		return compModel;
	}
	/**
	 * @param compModel the compModel to set
	 */
	public void setCompModel(String compModel) {
		this.compModel = compModel;
	}
	/**
	 * @return the compVersion
	 */
	public String getCompVersion() {
		return compVersion;
	}
	/**
	 * @param compVersion the compVersion to set
	 */
	public void setCompVersion(String compVersion) {
		this.compVersion = compVersion;
	}
	/**
	 * @return the compType
	 */
	public String getCompType() {
		return compType;
	}
	/**
	 * @param compType the compType to set
	 */
	public void setCompType(String compType) {
		this.compType = compType;
	}
	
	public Boolean Enabled(Boolean value) {
		return isEnabled;
	}
	
	public String PrintAll() {
		return "This is component information";
	}
	}

}
