package CompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
//Composite element
	private Integer id;
	private String name;

	private List<Department> childDepartments;

	public HeadDepartment(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.childDepartments=new ArrayList<>();
	}

	 public void printDepartmentName() {
	        childDepartments.forEach(Department::printDepartmentName);
	    }

	    public void addDepartment(Department department) {
	        childDepartments.add(department);
	    }

	    public void removeDepartment(Department department) {
	        childDepartments.remove(department);
	    }
}
