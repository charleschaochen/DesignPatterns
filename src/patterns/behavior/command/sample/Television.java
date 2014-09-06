package patterns.behavior.command.sample;

/**
 * Television POJO
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public class Television {
	private int volume; // Volumn value of the TV
	private int light; // Lightness value of the TV
	private boolean turnOn; // Turned on flag of the TV

	public Television() {
		// TODO Auto-generated constructor stub
		// Initialize TV properties
		this.volume = 10;
		this.light = 10;
		this.turnOn = false;
	}

	/**
	 * Change volume value
	 * 
	 * @param vol
	 */
	public void changeVol(int vol) {
		if (getVolume() + vol >= 0) {
			setVolume(getVolume() + vol);
		}
	}
	/**
	 * Change light value
	 * @param light
	 */
	public void changeLight(int light){
		if(getLight()+light>=0){
			setLight(getLight()+light);
		}
	}
	
	/**
	 * Change turn on flag
	 * @param turnOn
	 */
	public void changeTurnOn(boolean turnOn){
		setTurnOn(turnOn);
	}
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

}
