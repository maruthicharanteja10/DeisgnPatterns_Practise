package FacadeDesign;

public class ShopKeeper {
	private Mobileshop iphone;
	private Realme realme;
	private Samsung samsung;

	public ShopKeeper() {
		super();
		iphone = new Iphone();
		realme = new Realme();
		samsung = new Samsung();
	}

	public void iphoneSale() {
		iphone.Modelno();
		iphone.price();
	}

	public void samsungSale() {
		samsung.Modelno();
		samsung.price();
	}

	public void realmeSale() {
		realme.Modelno();
		realme.price();
	}
}
