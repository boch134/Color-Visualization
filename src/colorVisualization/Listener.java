package colorVisualization;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Listener extends WindowAdapter {
	
	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}

}