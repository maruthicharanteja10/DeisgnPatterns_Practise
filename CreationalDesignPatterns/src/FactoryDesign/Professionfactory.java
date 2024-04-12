package FactoryDesign;

public class Professionfactory {
	public Profession getProfession(String professionType) {
		if(professionType==null) {
			return null;
		}
		if(professionType.equalsIgnoreCase("Doctor")) {
			return new Doctor();
		}
		else if(professionType.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}
		else if(professionType.equalsIgnoreCase("engineer")) {
			return new Engineer();
		}
		
		return null;

	}
}
