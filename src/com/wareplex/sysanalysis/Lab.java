package com.wareplex.sysanalysis;

class Lab {
	
	private static Car SmartCar;

	public static void main(String[] args) {
		
		try {
			SmartCar = new Car();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SmartCar.startup();
		SmartCar.setCarID("1970 LT-1");
		SmartCar.setCarName("My Corvette (" + SmartCar.getCarID() + ")");		
		SmartCar.status();	
		
		System.out.print(SmartCar.status());
		System.out.print(SmartCar.runSelfCheck());
		
		SmartCar.shutdown();
		SmartCar = null;
		
	} 

}