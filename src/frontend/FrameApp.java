package frontend;

import javax.swing.*;

public class FrameApp extends JFrame {
	private static final long serialVersionUID = 7843364792449297253L;
	
	
	//VARIABLE
	
	
	
	//CONSTRUCTOR
	public FrameApp(JPanel p) {
		setParams();
		if(p!=null) {
			setPanel(p);
		}
		
	}
	private void setParams() {
		this.setTitle("GraphSkill");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void setPanel(JPanel p) {
		//this.removeAll();
		this.add(p);
		
		//TODO ADD listener
	}

	
}
