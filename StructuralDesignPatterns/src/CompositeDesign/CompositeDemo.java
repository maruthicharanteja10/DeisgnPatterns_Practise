package CompositeDesign;

public class CompositeDemo {
	public static void main(String args[]) {
		Department salesDepartment = new SalesDepartment(1, "Sales department");
		Department testingDepartment=new TestingDepartment(2, "Testing Department");
		Department financialDepartment = new FinancialDepartment(3, "Financial department");
		HeadDepartment headDepartment = new HeadDepartment(4, "Head department");

		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);
		headDepartment.addDepartment(testingDepartment);

		headDepartment.printDepartmentName();
		System.out.println("-----------");
		headDepartment.removeDepartment(financialDepartment);
		headDepartment.printDepartmentName();
		headDepartment.addDepartment(financialDepartment);
		System.out.println("-----------");
		headDepartment.printDepartmentName();
	}
}
