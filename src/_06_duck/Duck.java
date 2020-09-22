package _06_duck;

public class Duck {
int numberOfFriends = 0;
	String favoriteFood = "favoritefood";
	Duck(String favoriteFood, int numberOfFriends) {
	    this.favoriteFood = favoriteFood;
	    this.numberOfFriends = numberOfFriends;
	}
	
	void quack() {
		System.out.println("QUACK");
	}
	void waddle() {
		System.out.println("WADDLE");
	}
	
}
