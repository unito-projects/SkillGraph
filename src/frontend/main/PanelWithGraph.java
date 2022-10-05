package frontend.main;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class PanelWithGraph extends JPanel implements ActionListener{
	private static final long serialVersionUID = 2783877432168207499L;
	
	
	//VARIABLE
	private CanvasGraph canvas=new CanvasGraph();
	private JButton btnDialog=new JButton("Change Data");
	
	
	//CONSTRUCTOR
	public PanelWithGraph() {
		setComponents();
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
		
		ris.add(btnDialog);
		btnDialog.addActionListener(this);
		for(int i=0; i<10; i++) { //TODO NOT STATIC
			ris.add(new JLabel(i+" rendo effettivo"));
		}
		
		return ris;
	}
	
	
	//FOR CANVAS
	public void setValues(double[] list) {
		canvas.setValues(list);
	}
	
	
	//FOR DIALOG
	@Override public void actionPerformed(ActionEvent e) {
		
	}
}
