package CompositeDesign;

public class SalesDepartment implements Department {
	// leafs
	private int id;
	private String name;

	public SalesDepartment(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public void printDepartmentName() {
		System.out.println("Sales Department");
	}

}
