package dataStrutures;

import java.util.TreeMap;

public class ListSkill {
	
	//CONTRUCTOR  -------------------------------------------------
	private TreeMap<String, Skill> skills=new TreeMap<String, Skill>();
	public ListSkill() {}
	
	
	//ADDER AND REMOVER  ------------------------------------------
	/**Add an element (only if doesn't already have a skill with same name)
	 * @return true if added correctly, 
	 * false if it has already have a skill with the same name*/
	public boolean add(String name) {
		if(skills.containsKey(name)) return false;
		
		skills.put(name, new Skill(name));
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
