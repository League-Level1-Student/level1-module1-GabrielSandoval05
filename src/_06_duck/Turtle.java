package _06_duck;

public class Turtle {
int numberOfFriends = 0;
String favoriteFood = "Jellyfish";
	
	Turtle(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
void swim(){
	System.out.println("Swimming noises"); 
	
	
	}
	
	void eat() {
		System.out.println("*munch* yummy");
		
		
	}
}
