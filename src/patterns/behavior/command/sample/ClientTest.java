package patterns.behavior.command.sample;

/**
 * Client test for command design pattern
 * 
 * @author Charles Chen
 * @date 2014Äê9ÔÂ6ÈÕ
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Minitor monitor = new Minitor(new TurnOnCommand(tv));
		// Turn on the TV
		monitor.action();
		System.out.println("TV power: " + (tv.isTurnOn() ? "on" : "off"));

		// Increase TV's volume
		monitor.setCmd(new IncreVolCommand(tv));
		monitor.action();
		System.out.println("TV volume: " + tv.getVolume());

		// Increase TV's lightness
		monitor.setCmd(new IncreLightCommand(tv));
		monitor.action();
		System.out.println("TV lightness: " + tv.getLight());
		// Undo increasing lightness
		monitor.undo();
		System.out.println("TV lightness: " + tv.getLight());
	}

}
