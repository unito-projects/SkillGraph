package frontend;

import javax.swing.*;

public class FrameGraph extends JFrame{
	private static final long serialVersionUID = 7843364792449297253L;
	
	
	//VARIABLE
	private CanvasGraph canvas=new CanvasGraph();
	
	
	//CONSTRUCTOR
	public FrameGraph() {
		setParams();
		setComponents();
	}
	public void setParams() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void setComponents() {
		JSplitPane split=new JSplitPane();
		this.add(split);
		
		split.setLeftComponent(new JLabel("ToDo"));
		split.setRightComponent(canvas);
	}

	
	//FOR CANVAS
	public void setValuesForCanvas(double values[]) {
		canvas.setValues(values);
	}
}
