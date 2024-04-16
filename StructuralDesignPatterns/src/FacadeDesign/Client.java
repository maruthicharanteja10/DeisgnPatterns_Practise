package FacadeDesign;

import java.util.Scanner;

public class Client {
	private static int choice;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("===Mobile shop===");
		System.out.println("1.Iphone \n 2.Samsung \n 3.Realme ");
		System.out.println("Enter our choice");
		choice = s.nextInt();
		ShopKeeper sk = new ShopKeeper();
		switch (choice) {
		case 1: {
			sk.iphoneSale();
			break;
		}
		case 2: {
			sk.samsungSale();
			break;
		}
		case 3: {
			sk.realmeSale();
			break;
		}
		default:
			System.out.println("Nothing is purchased");
		}
	}
}
