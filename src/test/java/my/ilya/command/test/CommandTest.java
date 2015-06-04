package my.ilya.command.test;

import my.ilya.command.Light;
import my.ilya.command.Switcher;
import my.ilya.command.TurnCommand;
import my.ilya.command.TurnOffCommand;
import my.ilya.command.TurnOnCommand;

import org.junit.Assert;
import org.junit.Test;

public class CommandTest extends Assert{

	@Test
	public void testTurnOnLight(){
		TurnCommand turnOn = new TurnOnCommand();
		Light light = new Light();
		turnOn.setLight(light);
		Switcher switcher = new Switcher(turnOn, null);
		switcher.flipUp();		
		assertTrue(light.isTurnedOn());
		
		try{
			turnOn.setLight(null);
			turnOn.execute();
			fail();
		} catch(NullPointerException e){			
		}
		
	}
	
	@Test
	public void testTurnOffLigt(){
		TurnCommand turnOff = new TurnOffCommand();
		Light light = new Light();
		turnOff.setLight(light);
		Switcher switcher = new Switcher(null, turnOff);
		switcher.flipDown();		
		assertFalse(light.isTurnedOn());
		
		try{
			turnOff.setLight(null);
			turnOff.execute();
			fail();
		} catch(NullPointerException e){			
		}
	}
	
}
