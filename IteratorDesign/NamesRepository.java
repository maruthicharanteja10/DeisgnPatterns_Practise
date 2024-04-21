package IteratorDesign;

public class NamesRepository implements Aggregate<String>{

	private String names[] = { "Ajay", "Vijay", "Martin", "Racheal", "Kim" };

	 

	public String[] getNames() {
	    return names;
	  }

	@Override
	public Iterator<String> createIterator() {
		
		return new CollectionofNamesIterate(this);
	}

}
