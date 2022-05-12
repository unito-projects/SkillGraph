package dataStrutures.generics;


public class Connection <E>{  
	protected Node<E>[] elementsConnected;
	
	//CONSTRUCTOR  -----------------------------------------------------
	public Connection (Node<E> elements[]) {
		this.elementsConnected=elements;
		
		notifyNodeOfConnection();
	}
	/**Call the elements (skill) to notify them of the creation
	 * of this choice */
	private void notifyNodeOfConnection() {
		for(Node<E> elem : elementsConnected) {
			elem.addConnection(this);
		}
	}

}
