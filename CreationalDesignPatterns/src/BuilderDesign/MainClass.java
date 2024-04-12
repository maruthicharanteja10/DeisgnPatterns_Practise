package BuilderDesign;

public class MainClass {
public static void main(String[] args) {
		
		//create object of required homebuilder
		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		//create object of director that will keep an eye on your builder
		Director director = new Director(earthQuakeResistantBuilder);
		
		director.manageRequiredHomeConstruction();
		Home homeConstructedAtTheEnd = director.getComplexHomeObject();
		
		System.out.println(homeConstructedAtTheEnd);
		System.out.println(homeConstructedAtTheEnd.floor);
		System.out.println(homeConstructedAtTheEnd.terrace);
		System.out.println(homeConstructedAtTheEnd.walls);
	}
}
