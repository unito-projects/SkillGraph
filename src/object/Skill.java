package object;

import java.util.ArrayList;
import dataStrutures.Choice;

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
	public Skill(String name) {
		this.name=name;
	}
	
	//CHOICES  --------------------------------------------------------
	private ArrayList<Choice<Skill>> choices=new ArrayList<Choice<Skill>>();
	
}
