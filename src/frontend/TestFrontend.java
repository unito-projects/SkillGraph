package frontend;

public class TestFrontend {
	
	//MAIN FOR TESTING FRONTEND
	public static void main(String[] args) {
		FrameGraph f=new FrameGraph();
		f.setValuesForCanvas(new double[] {
				0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1,
				//1,1,1,1,1,1,1,1,1,1,1,1,1
				});
		f.setVisible(true);
	}
}
