package CompositeDesign;

public class FinancialDepartment implements Department {
	// leafs
	private String name;
	private int id;

	public FinancialDepartment(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public void printDepartmentName() {
		System.out.println("Financial Department");
	}

}
