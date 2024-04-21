package IteratorDesign;

public class CollectionofNamesIterate implements Iterator<String>{
	private String names[];
	  private int index;

	  public CollectionofNamesIterate(NamesRepository namesRepository) {
	    this.names = namesRepository.getNames();
	    index = 0;
	  }
	@Override
	public boolean hasNext() {
		
		return index < names.length;
	}

	@Override
	public String next() {
		 if (hasNext()) {
		      return names[index++];
		    }
		    return null;
	}

}
