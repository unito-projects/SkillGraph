package frontend;

public class TestFrontend {
	
	//MAIN FOR TESTING FRONTEND
	public static void main(String[] args) {
		FrameGraph f=new FrameGraph();
		f.setValuesForCanvas(new double[] {
				0.12, 1, 0.5, 0.4, 0.4, 0.8, 1,
				//1,1,1,1,1,1,1,1,1,1,1,1,1
				});
		f.setVisible(true);
	}
}
