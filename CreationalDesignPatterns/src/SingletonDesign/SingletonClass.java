package SingletonDesign;

public class SingletonClass {
	private static SingletonClass singletonInstance = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		return singletonInstance;
	}

	public void SimpleMethod() {
		System.out.println("HashCode of Singleton class : " + singletonInstance);
	}
}
