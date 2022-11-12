package dataStrutures.generics;

import java.util.ArrayList;

public class Node <S, C>{
	private S property;

	//CONNECTIONS  ------------------------------------------------
	private ArrayList<Connection<S, C>> connections=new ArrayList<Connection<S, C>>();
	public void addConnection(Connection<S, C> connection) {
		connections.add(connection);
	}


	//ELEMENTS  ---------------------------------------------------
	public S getNodeProperty() {
		return property;
	}
	public void setNodeProperty(S element) {
		this.property = element;
	}


	//COSTRUCTOR  -------------------------------------------------
	public Node(S elem) {
		this.setNodeProperty(elem);
	}
}
