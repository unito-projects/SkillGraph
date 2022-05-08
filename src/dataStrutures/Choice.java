package dataStrutures;

public class Choice <E>{
	private E[] elementsToChooseIn;
	
	//INDEX SELECTED  --------------------------------------------------
	private Integer indexChoosenElement; 
	/**must be always between 0 and the list length - 1    or   null
	 * @return true if it actually change the index, false otherwise  */
	public boolean choose(Integer index) {
		if(index==null || (index>=0 && index<elementsToChooseIn.length)) {
			indexChoosenElement=index;
			return true;
		}
		
		return false;
	}
	public E getChoosenElement() {
		if(indexChoosenElement==null) return null;
		return elementsToChooseIn[indexChoosenElement];
	}


	//CONSTRUCTOR  -----------------------------------------------------
	public Choice (E elements[]) {
		this.elementsToChooseIn=elements;
	}
}
