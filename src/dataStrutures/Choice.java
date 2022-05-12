package dataStrutures;

public class Choice{ 
	
	//CONSTRUCTOR  -----------------------------------------------------
	public int length;
	public Choice(int length) {
		this.length=length;
	}
	
	
	//INDEX SELECTED  --------------------------------------------------
	private Integer indexChoosenElement; 
	/**Must be always between 0 and the list length - 1    or   null
	 * @return true if it actually change the index, false otherwise  */
	protected boolean choose(Integer index) {
		if(index==null || (index>=0 && index<length)) {
			indexChoosenElement=index;
			return true;
		}
		
		return false;
	}
	public Integer getChoosenIndex() {
		return indexChoosenElement;
	}


}
