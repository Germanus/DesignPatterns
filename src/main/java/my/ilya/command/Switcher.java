package my.ilya.command;

public class Switcher {

	private Command flipUpCommand;
	private Command flipDownCommand;
	
	public Switcher(Command flipUpCommand, Command flipDownCommand) {
		this.flipUpCommand = flipUpCommand;
		this.flipDownCommand = flipDownCommand;
	}

	public void flipUp() {
		flipUpCommand.execute();		
	}

	public void flipDown() {
		flipDownCommand.execute();		
	}
		

}
