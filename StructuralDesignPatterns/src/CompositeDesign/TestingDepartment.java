package CompositeDesign;

public class TestingDepartment implements Department {
	private int id;
	private String name;

	public TestingDepartment(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public void printDepartmentName() {
		System.out.println("Testing Department");
	}

}
