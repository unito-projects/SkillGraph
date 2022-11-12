package frontend;

import javax.swing.*;
import java.awt.*;

public class FrameApp extends JFrame {
	private static final long serialVersionUID = 7843364792449297253L;


	//VARIABLE



	//CONSTRUCTOR
	public FrameApp(Component p) {
		setParams();
		if(p!=null) {
			setComponent(p);
		}

	}
	private void setParams() {
		this.setTitle("GraphSkill");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void setComponent(Component p) {
		//this.removeAll();
		this.add(p);

		//TODO ADD listener
	}


}
