package my.ilya.command;

public abstract class TurnCommand implements Command{

	protected Light light;

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}	

}
