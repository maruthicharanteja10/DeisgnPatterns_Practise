package PrototypePattern;

public abstract class Profession implements Cloneable {
	public int id;
	public String name;

	abstract void print();
	
	public Object cloningMethod() {
		
		Object clone=null;
		try {
			clone=super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
