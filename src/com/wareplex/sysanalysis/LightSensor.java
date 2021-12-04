package com.wareplex.sysanalysis;

public class LightSensor implements edu.fiu.sysdesign.SelfCheckCapable {
	
	public boolean IsItDark() {
		return false;
	}
	
	public String status() {
		return getComponentName() + " - I can see the light!\n";
	}
	
	public String getComponentName() {
		return "13567: Light Sensor";
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
