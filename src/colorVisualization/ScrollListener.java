package colorVisualization;
import java.awt.*;
import java.awt.event.*;

public class ScrollListener implements AdjustmentListener {
	TextField textRed;
	TextField textBlue;
	TextField textGreen;
	NewCanvas canvas;
	public ScrollListener(TextField textRed, TextField textBlue, TextField textGreen, NewCanvas canvas) {
		super();
		this.textRed = textRed;
		this.textBlue = textBlue;
		this.textGreen = textGreen;
		this.canvas = canvas;
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int value = e.getValue();
		Scrollbar source = (Scrollbar)e.getSource();
		
		if (source.getName()=="scrollbarRed") {
			textRed.setText(String.valueOf(value));
		}
		else if (source.getName()=="scrollbarGreen") {
			textGreen.setText(String.valueOf(value));
		}
		else if (source.getName()=="scrollbarBlue") {
			textBlue.setText(String.valueOf(value));
		}
		
		int Red = Integer.parseInt(textRed.getText());
		int Blue = Integer.parseInt(textBlue.getText());
		int Green = Integer.parseInt(textGreen.getText());

		canvas.setBackground(new Color(Red,Green,Blue));
		canvas.setColors(Red, Green, Blue);
		canvas.repaint();
		
		
		
	}
	}
