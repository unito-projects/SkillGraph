package dataStrutures;

import java.util.TreeMap;
import dataStrutures.generics.Node;

public class ListSkill {
	
	//CONTRUCTOR  -------------------------------------------------
	private TreeMap<String, Node<Skill, Choice>> skills
		=new TreeMap<String, Node<Skill, Choice>>();
	
	
	//ADDER AND REMOVER  ------------------------------------------
	/**Add an element (only if doesn't already have a skill with same name)
	 * @return true if added correctly, 
	 * false if it has already have a skill with the same name*/
	public boolean add(String name) {
		if(skills.containsKey(name)) return false;
		
		skills.put(name, new Node<>(new Skill(name)));
		return true;
	}
	/**Remove an element 
	 * @return true if removed correctly, 
	 * false if doesn't have the element in the skill list*/
	public boolean remove(String name) {
		if(skills.remove(name)!=null) return true;
		
		return false;
	}
}
