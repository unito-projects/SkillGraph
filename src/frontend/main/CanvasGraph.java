package frontend.main;

import java.awt.*;
import javax.swing.*;

public class CanvasGraph extends JPanel {
	private static final long serialVersionUID = 3969717778652985782L;


	//CONSTRUCTOR
	public CanvasGraph() {}


	//GETTER AND SETTER
	private double values[]=null;
	public double[] getValues() {
		return values;
	}
	public void setValues(double values[]) {
		this.values = values;
	}

	//OVERRIDE ->DRAW
	@Override protected void paintComponent(Graphics g) {
		//SUPER AND CHECK
		super.paintComponent(g);
		if(values==null||values.length==0) return;

		//GET POINT
		double deltaAngle=(2*Math.PI)/values.length;
		int[] xOnScreen=new int[values.length];
		int[] yOnScreen=new int[values.length];
		for(int i=0; i<values.length; i++) {
			xOnScreen[i]=getXInGraph(values[i], i*deltaAngle);
			yOnScreen[i]=getYInGraph(values[i], i*deltaAngle);
		}

		//CREATE POLYGON
		Color color = new Color(0, 0, 1, 0.5f); //Red
		g.setColor(color);
		g.fillPolygon(xOnScreen, yOnScreen, values.length);
		g.setColor(Color.black);


		//TEMP
		int minSize=this.getHeight()<this.getWidth()?  this.getHeight():this.getWidth();
		g.drawOval(this.getWidth()/2-minSize/3, this.getHeight()/2-minSize/3, minSize/3*2, minSize/3*2);

		for(int i=0; i<values.length; i++) {
			//g.drawLine(this.getWidth()/2, this.getHeight()/2, xOnScreen[i], yOnScreen[i]);
			g.drawLine(this.getWidth()/2, this.getHeight()/2, getXInGraph(1, deltaAngle*i), getYInGraph(1, deltaAngle*i));
			g.drawString(""+i, getXInGraph(1.2, deltaAngle*i), getYInGraph(1.2, deltaAngle*i));

		}
	}
	private int getYInGraph(double value, double angle) {  //TODO unite in only one methods    + check for value too large
		double minSize=this.getHeight()<this.getWidth()?  this.getHeight():this.getWidth();
		double module=value*minSize/3;
		double yRelative=module*Math.sin(angle-Math.PI/2);

		//RETURN
		double yCenter=this.getHeight()/2;
		return (int)(yCenter+yRelative);
	}
	private int getXInGraph(double value, double angle) {
		double minSize=this.getHeight()<this.getWidth()?  this.getHeight():this.getWidth();
		double module=value*minSize/3;
		double xRelative=module*Math.cos(angle-Math.PI/2);

		//RETURN
		double xCenter=this.getWidth()/2;
		return (int)(xCenter+xRelative);
	}

}
