package com.wareplex.sysanalysis;

public class Video implements edu.fiu.sysdesign.SelfCheckCapable {
	
	private long image;
	private long video;
	/**
	 * @return the image
	 */
	public long getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(long image) {
		this.image = image;
	}
	/**
	 * @return the video
	 */
	public long getVideo() {
		return video;
	}
	
	public String status() {
		return getComponentName() + " - Motion pictures here I come!\n";
	}
	
	public String getComponentName() {
		return "88573: Video Sensor";
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
