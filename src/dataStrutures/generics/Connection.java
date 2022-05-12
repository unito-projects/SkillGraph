package dataStrutures.generics;


public class Connection <S, C>{  
	private S property;
	protected Node<S, C>[] elementsConnected;
	
	//CONSTRUCTOR  -----------------------------------------------------
	public Connection (S propertyConnection, Node<S, C> elements[]) {
		this.setNodeProperty(propertyConnection);
		this.elementsConnected=elements;
		
		notifyNodeOfConnection();
	}
	/**Call the elements (skill) to notify them of the creation
	 * of this choice */
	private void notifyNodeOfConnection() {
		for(Node<S, C> elem : elementsConnected) {
			elem.addConnection(this);
		}
	}
	
	//ELEMENTS  ---------------------------------------------------
	public S getNodeProperty() {
		return property;
	}
	public void setNodeProperty(S element) {
		this.property = element;
	}
	
	
}
