package my.ilya.command;

public class Light {

	private boolean isTurnedOn;

	public boolean isTurnedOn() {
		return isTurnedOn;
	}

	public void setTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}

	public void turnOn() {
		isTurnedOn = true;
		System.out.println("Light is turned on!");
	}
	
	public void turnOff() {
		isTurnedOn = false;
		System.out.println("Light is turned off!");
	}
	
}
