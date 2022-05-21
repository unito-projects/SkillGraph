package frontend;

import java.awt.GridLayout;

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
		this.setTitle("GraphSkill");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void setComponents() {
		JSplitPane split=new JSplitPane();
		this.add(split);
		
		split.setLeftComponent(getLeftPanel());
		split.setRightComponent(canvas);
	}
	public JPanel getLeftPanel() {
		JPanel ris=new JPanel();
		ris.setLayout(new GridLayout(11, 1));
		
		ris.add(new JButton("Change Data"));
		for(int i=0; i<10; i++) { //TODO NOT STATIC
			ris.add(new JLabel(i+" rendo effettivo"));
		}
		
		return ris;
	}

	
	//FOR CANVAS
	public void setValuesForCanvas(double values[]) {
		canvas.setValues(values);
	}
}
