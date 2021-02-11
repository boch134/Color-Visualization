package colorVisualization;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class NewCanvas extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int blue;
	int green;
	int red;
	
	
	public NewCanvas() {
		this.blue=0;
		this.red=0;
		this.green=0;
	}
	public NewCanvas(int r , int v , int b)
	{
		this.blue=b;
		this.red=r;
		this.green=v;
	}
	
	public void setColors(int r, int g, int b) {
		this.green=g;
		this.blue=b;
		this.red=r;
	}
	public void paint(Graphics g)
	{
		
		Color C =new Color(red,green,blue);
		g.setColor(C);
		g.fillRect(0, 0, 300, 300);
		this.setVisible(true);
	}
	

	
}
