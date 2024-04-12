package AbstractFactoryDesign;

public class ProfessionAbstractFactory extends AbstractFactory{
	public Profession getProfession(String professionType) {
		if (professionType == null) {
			return null;
		} else if (professionType.equalsIgnoreCase("teacher")) {
			return new Teacher();
		} else if (professionType.equalsIgnoreCase("engineer")) {
			return new Engineer();
		}
		return null;

	}
}
