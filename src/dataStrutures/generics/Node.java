package dataStrutures.generics;

import java.util.ArrayList;

public class Node <E>{
	private E element;
	
	//CONNECTIONS  ------------------------------------------------
	private ArrayList<Connection<E>> connections=new ArrayList<Connection<E>>();
	public void addConnection(Connection<E> connection) {
		connections.add(connection);
	}
	
	
	//ELEMENTS  ---------------------------------------------------
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	
	
	//COSTRUCTOR  -------------------------------------------------
	public Node(E elem) {
		this.setElement(elem);
	}
}
