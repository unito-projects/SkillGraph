package frontend;

import frontend.main.PanelWithGraph;

public class TestFrontend {
	
	//MAIN FOR TESTING FRONTEND
	public static void main(String[] args) {
		
		//CREO DATI
		int max=50;
		double list[]=new double[max];
		for(int i=0; i<max; i++) {
			list[i]=i/(double)max;
		}
		
		
		PanelWithGraph panel=new PanelWithGraph();
		panel.setValues(
				//list);
				new double[] {
				//0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 0,
				1, 0.3, 0.2, 0.7, 0.4, 0.5
				//1,1,1,1,1,1,1,1,1,1,1,1,1
				});
		
		FrameApp f=new FrameApp(panel);
		f.setVisible(true);
	}
}
