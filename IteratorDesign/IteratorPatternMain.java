package IteratorDesign;

public class IteratorPatternMain {
	public static void main(String[] args) {
		NamesRepository namesRepository = new NamesRepository();

		Iterator<String> iterator = namesRepository.createIterator();

		while (iterator.hasNext()) {
			System.out.println("Name : " + iterator.next());
		}
	}
}
