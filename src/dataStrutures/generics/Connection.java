package dataStrutures.generics;

//TODO idk but if remove crash everythings
public class Connection <N extends Node<Connection<?>>>{  
	protected N[] elementsConnected;
	
	//CONSTRUCTOR  -----------------------------------------------------
	public Connection (N elements[]) {
		this.elementsConnected=elements;
		
		notifyNodeOfConnection();
	}
	/**Call the elements (skill) to notify them of the creation
	 * of this choice */
	private void notifyNodeOfConnection() {
		for(N elem : elementsConnected) {
			elem.addConnection(this);
		}
	}

}
