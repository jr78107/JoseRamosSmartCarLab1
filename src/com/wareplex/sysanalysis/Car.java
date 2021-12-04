package com.wareplex.sysanalysis;

public class Car {
	
	private String carID;
	private String carName;
	private long direction;
	private float speed;
	private static Video VideoSensor;
	private static Accelerometer AccelSensor;
	private static LightSensor LightEyeSensor;
	private static GPS GPSSensor;
	private static Lidar LidarSensor;
	private static Distance DistanceSensor;
	private static Battery Power;
	private static Lights HeadLights;
	private static Wheels Tires;
	
	public void startup() {
		try {
			VideoSensor = new Video();
			AccelSensor = new Accelerometer();
			LightEyeSensor = new LightSensor();
			GPSSensor = new GPS();
			LidarSensor = new Lidar();
			DistanceSensor = new Distance();
			Power = new Battery();
			HeadLights = new Lights();
			Tires = new Wheels();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.print(Power.getComponentName() + " | " + HeadLights.getComponentName() 
			+ " | " + Tires.getComponentName() + " Ready...\n\n");

	}
	
	/**
	 * @return the carID
	 */
	public String getCarID() {
		return carID;
	}
	/**
	 * @param carID the carID to set
	 */
	public void setCarID(String carID) {
		this.carID = carID;
	}
	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * @return the vector
	 */

	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public String runSelfCheck() {
		String statusMessage;
		
		statusMessage = "Critical System(s):\n";
		statusMessage = statusMessage + Power.status();
		statusMessage = statusMessage + Tires.status();
		statusMessage = statusMessage + "\nAuxilliary System(s):\n";
		statusMessage = statusMessage + HeadLights.status();
		statusMessage = statusMessage + "\nSensor System(s):\n";
		statusMessage = statusMessage + VideoSensor.status();
		statusMessage = statusMessage + AccelSensor.status();
		statusMessage = statusMessage + LightEyeSensor.status();
		statusMessage = statusMessage + GPSSensor.status();
		statusMessage = statusMessage + LidarSensor.status();
		statusMessage = statusMessage + DistanceSensor.status();	
		statusMessage = statusMessage + "\nAll sensors/systems READY!\n";		
		return statusMessage;
	}
	
	public void shutdown() {
		
		try {
			System.out.print("\nWHAT!? Leaving Already?\nOK Fine!\nBegin Shutting down the car:\n");
			AccelSensor = null;
			LightEyeSensor = null;
			GPSSensor = null;
			LidarSensor = null;
			DistanceSensor = null;
			Power = null;
			HeadLights = null;
			Tires = null;
			System.out.print("All components destroyed!");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.exit(0);
	}
	
	public void moveForward( float arg) {
		
	}
	
	public void moveBackward(float arg) {
		
	}
	
	public void turnRight(float arg) {
		
	}
	
	public void turnLeft(float arg) {
		
	}

	public String selfCheck() {
		return getCarName() + " - Alive and well!\n\n";
	}
	
	public String status() {
		return getCarName() + " - Alive and well!\n\n";
	}
	
	/**
	 * @return the direction
	 */
	public long getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(long direction) {
		this.direction = direction;
	}
	
	public void Backup() {
		
	}
	
	public void InstallUpdates() {
		
	}
	
	public void RollbackUpdates() {
		
	}
	
	public void UpdateComponents() {
		
	}
	
	public void SoftwareCenterUpdates() {
		
	}
	
}
