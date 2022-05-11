package dataStrutures;

import dataStrutures.generics.Connection;
import dataStrutures.generics.Node;

//TODO I do  not understand
public class Choice extends Connection<Node<Connection<?>>> { 
	
	
	
	public Choice(Node<Connection<?>>[] elements) {
		super(elements);
		// TODO Auto-generated constructor stub
	}
	//INDEX SELECTED  --------------------------------------------------
	private Integer indexChoosenElement; 
	/**Must be always between 0 and the list length - 1    or   null
	 * @return true if it actually change the index, false otherwise  */
	protected boolean choose(Integer index) {
		if(index==null || (index>=0 && index<elementsConnected.length)) {
			indexChoosenElement=index;
			return true;
		}
		
		return false;
	}
	public Node<?> getChoosenElement() {
		if(indexChoosenElement==null) return null;
		return elementsConnected[indexChoosenElement];
	}


}
