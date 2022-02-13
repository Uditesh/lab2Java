package exercise_2;

import java.lang.*;
import javax.swing.JOptionPane;

public class Lotto {
	static int min = 1;
	static int max = 9;
	int sum = 0;
	int[] numbersArray = new int[3];

	// constructor which creates random numbers
	Lotto(){
	    for (int i = 0; i < numbersArray.length; i++) {
	    	numbersArray[i] = (int)Math.floor(Math.random()*(max-min+1)+min); 
	    	sum = sum + numbersArray[i];
	    }
	}
	
	public static void main(String[] args) {
		
		int userInput = 0;
		int flag = 0;
		// TODO Auto-generated method stub
		
		// throwing lotto 5 times
		for(int i=0;i<5;i++) {
			userInput = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number between 3 to 27"));
			Lotto lotto = new Lotto();
			// every loop we check if sum of 3 random numbers equals user input
			if(userInput == lotto.sum) {
				System.out.println("Lotto throw : " + (i+1));
				System.out.println("Random number 1 : " + lotto.numbersArray[0]);
				System.out.println("Random number 2 : " + lotto.numbersArray[1]);
				System.out.println("Random number 3 : " + lotto.numbersArray[2]);
				System.out.println("Total sum : " + lotto.sum);
				JOptionPane.showMessageDialog(null, "User wins!");
				flag = 1;
				break;
			}
			System.out.println("Lotto throw : " + (i+1));
			System.out.println("Random number 1 : " + lotto.numbersArray[0]);
			System.out.println("Random number 2 : " + lotto.numbersArray[1]);
			System.out.println("Random number 3 : " + lotto.numbersArray[2]);
			System.out.println("Total sum : " + lotto.sum);
			System.out.println("----------------------");
			JOptionPane.showMessageDialog(null, "User input : "+ userInput +"\n Lotto total : "+lotto.sum);
			lotto.sum = 0;
		}
		// if user is not won then computer wins
		if(flag != 1) {
			JOptionPane.showMessageDialog(null, "Computer wins!");	
		}
			
	}
}
