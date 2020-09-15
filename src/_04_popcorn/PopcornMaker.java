package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		
		 
		String input = JOptionPane.showInputDialog("What flavor would you like the popcorn?");
		String minutes = JOptionPane.showInputDialog("How many minutes should we cook it for?");
		Popcorn bag = new Popcorn (input); 
		Microwave microwave = new Microwave();
		
		int time = Integer.parseInt(minutes);
				
		microwave.setTime(time);
		microwave.putInMicrowave(bag);
		microwave.startMicrowave();
		
		bag.eat();
		
		
		
	}
}
