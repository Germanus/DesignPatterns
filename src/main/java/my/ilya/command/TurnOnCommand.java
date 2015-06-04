package my.ilya.command;

import static com.google.common.base.Preconditions.*;

public class TurnOnCommand extends TurnCommand {

	public void execute() {
		checkNotNull(light);
		if(light != null){
			light.turnOn();
		}		
	}


}
