package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("thomas");
		//1.
		cat.meow();
		//2.
		cat.printName();
		//3.
		for(int i = 0; i<9; i++) {
			cat.kill();
		}
	}
}
