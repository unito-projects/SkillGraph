package dataStrutures;

public class Skill {
	
	//NAME  -----------------------------------------------------------
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//CONSTRUCTOR  ----------------------------------------------------
	protected Skill(String name) {
		this.name=name;
	}


}
