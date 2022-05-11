package dataStrutures.generics;

import java.util.ArrayList;

public class Node <C extends Connection<?>>{
	
	
	//CONNECTIONS  ------------------------------------------------
	private ArrayList<C> connections=new ArrayList<C>();
	public void addConnection(C connection) {
		connections.add(connection);
	}

}
