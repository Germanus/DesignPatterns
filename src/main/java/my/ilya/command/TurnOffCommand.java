package my.ilya.command;

import static com.google.common.base.Preconditions.checkNotNull;

public class TurnOffCommand extends TurnCommand{

	public void execute() {
		checkNotNull(light);
		if(light != null){
			light.turnOff();
		}		
	}

}
