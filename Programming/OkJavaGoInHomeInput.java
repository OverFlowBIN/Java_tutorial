import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator; // Assist를 이용하여 자동 import 할 수 있다.
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {
	
	// Parameter, 매개변수
	
	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter a ID");
//		String bright = JOptionPane.showInputDialog("Enter a Bright Level(Percent)");
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator Call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security Off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light On
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " Mood Lamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
