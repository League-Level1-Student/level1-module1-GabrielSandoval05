package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar lol = new RaceCar ("brand", 5);
		// 2. Print the RaceCar's position in the race
	int place = lol.getPositionInRace();
System.out.println(place);
		// 3. Crash the RaceCar
		lol.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
if(lol.isDamaged()) {
	lol.pit();
}
		// 5. Help the car move into first place.
lol.getPositionInRace();
lol.overtake();
lol.getPositionInRace();
while(lol.getPositionInRace() > 1)
{
	lol.overtake();
}

	}
}
