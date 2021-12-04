/**
 * 
 */
package com.wareplex.sysanalysis;

/**
 * @author Jose
 *
 */
public class Wheels implements edu.fiu.sysdesign.SelfCheckCapable {
	
	public String status() {
		return getComponentName() + " - All four fully inflated!\n";
	}
	
	public void frontWheels(float arg) {
		
	}
	
	public void backWheels(float arg) {
		
	}
	
	public String getComponentName() {
		return "92036: Wheels";
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