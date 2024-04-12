package FactoryDesign;

import java.util.Scanner;

public class FactoryPatternMain {
	public static void main(String[] args) {
		Professionfactory professionfactory = new Professionfactory();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your profession");
		Profession doc=professionfactory.getProfession(s.next());
		doc.print();
		 
	}
}
