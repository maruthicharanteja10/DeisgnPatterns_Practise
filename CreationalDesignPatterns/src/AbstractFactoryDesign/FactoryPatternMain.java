package AbstractFactoryDesign;

import java.util.Scanner;

public class FactoryPatternMain {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter true for TraineeProfession/else false");
		AbstractFactory abstractFactory =AbstractFactoryProducer.getProfession(s.nextBoolean());
		
		System.out.println("Enter your profession");
		Profession prof=abstractFactory.getProfession(s.next());
		prof.print();	 
	}
}
