package SingletonDesign;

public class MainClass {
	public static void main(String[] args) {
		SingletonClass singletonObject = SingletonClass.getInstance();
		singletonObject.SimpleMethod();
		SingletonClass singletonObject2 = SingletonClass.getInstance();
		singletonObject2.SimpleMethod();
		Cricket c1 = new Cricket();
		System.out.println(c1);
		Cricket c2 = new Cricket();
		System.out.println(c2);
	}
}
