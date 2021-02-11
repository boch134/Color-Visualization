package colorVisualization;

import java.awt.*;
import java.awt.event.*;

public class ColorVisualization extends WindowAdapter{
	Frame frame;
	Panel leftPanel;
	Panel rightPanel;
	NewCanvas canvas;
	Scrollbar scrollbarRed ;
	Scrollbar scrollbarBlue ;
	Scrollbar scrollbarGreen ;
	TextField textFieldRed ;
	TextField textFieldBlue ;
	TextField textFieldGreen ;
	
	public ColorVisualization() {
		frame = new Frame();
		leftPanel = new Panel();
		rightPanel = new Panel();
		rightPanel.setLayout(new GridLayout(3,1));
		canvas = new NewCanvas();
		canvas.setBackground(Color.black);
		canvas.setBounds(0, 0, 300, 300);
		leftPanel.add(canvas);
		
		Label labelRed = new Label("Red");
		Label labelBlue = new Label("Blue");
		Label labelGreen = new Label("Green");
		
		textFieldRed = new TextField("0");
		textFieldBlue = new TextField("0");
		textFieldGreen = new TextField("0");
		
		textFieldRed.setEditable(false);
		textFieldGreen.setEditable(false);
		textFieldBlue.setEditable(false);
		
		scrollbarRed = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		scrollbarBlue = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		scrollbarGreen = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		
		scrollbarRed.setName("scrollbarRed");
		scrollbarGreen.setName("scrollbarGreen");
		scrollbarBlue.setName("scrollbarBlue");
		
		
		
		
		Panel panelRed= new Panel();
		Panel panelBlue= new Panel();
		Panel panelGreen= new Panel();
		
		panelRed.add(labelRed);
		panelRed.add(textFieldRed);
		panelRed.add(scrollbarRed);
		
		panelBlue.add(labelBlue);
		panelBlue.add(textFieldBlue);
		panelBlue.add(scrollbarBlue);
		
		panelGreen.add(labelGreen);
		panelGreen.add(textFieldGreen);
		panelGreen.add(scrollbarGreen);
		
		rightPanel.add(panelRed);
		rightPanel.add(panelGreen);
		rightPanel.add(panelBlue);
		
		
		frame.setLayout(new BorderLayout());
		frame.add(leftPanel,"West");
		frame.add(rightPanel,"East");
		
		frame.setVisible(true);
		frame.setTitle("Color Visualisation");
		
		
		
		scrollbarRed.addAdjustmentListener(new ScrollListener(textFieldRed, textFieldBlue, textFieldGreen, canvas));
		scrollbarGreen.addAdjustmentListener(new ScrollListener(textFieldRed, textFieldBlue, textFieldGreen, canvas));
		scrollbarBlue.addAdjustmentListener(new ScrollListener(textFieldRed, textFieldBlue, textFieldGreen, canvas));
		Listener listener = new Listener();
		frame.addWindowListener(listener);
		
		frame.pack();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorVisualization();

	}

}







