package exercise_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
	int countCorrectAnswer = 0;
	
	// Greeting message and instructions
	public void greet() {
		JOptionPane.showMessageDialog(null,"Hello, Welcome to Quiz Test. PLEASE WRITE 'a','b','c' or 'd' ONLY!");  
		simulateQuestion();
	}
	
	// Simulating questions with options
	public void simulateQuestion() {
		int min = 1;
		int max = 4;
		int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
		String question1 = "What is the main function of a Java compiler?\n"
				+ "(a) It places the program in memory to execute it \n"
				+ "(b) It translates the Java source code into bytecodes that represent the tasks to execute \n"
				+ "(c) It examines the bytecodes to ensure that they  are valid and do not violate Java’s security restrictions \n"
				+ "(d) It executes the bytecodes";
		
		String question2 = "Which of the following processes is typically used by JVM to execute bytecode? \n"
				+ "(a) A combination of interpretation and just-in-time (JIT) compilation \n"
				+ "(b) Regular time compilation only \n"
				+ "(c) Interpretation \n"
				+ "(d) Just-in-time (JIT) compilation";
		
		String question3 = "Which one of the following symbols indicates a single line comment in Java application source code: \n"
				+ "(a) // \n"
				+ "(b) \\ \n"
				+ "(c) #! \n"
				+ "(d) ##";
		
		String question4 = "Class variables must be declared as___________ \n"
						+ "(a) var \n"
						+ "(b) final \n"
						+ "(c) static \n"
						+ "(d) const ";
		String question5 = "Which of the following typically groups related classes so that they could be imported into programs and reused? \n"
				+ "(a) Function \n"
				+ "(b) IDE \n"
				+ "(c) Method \n"
				+ "(d) Package ";
		String questionsArray [] = {question1,question2,question3,question4,question5};
		String actualAnswersArray [] = {"b","a","a","c","d"};
		ArrayList<String> userAnswersArray = new ArrayList<String>();
		for(int i = 0 ; i < questionsArray.length ; i++) {
			userAnswersArray.add((String)JOptionPane.showInputDialog(null,questionsArray [i]));
			checkAnswer(actualAnswersArray[i],userAnswersArray.get(i),randomNumber);		
		}
		 //JOptionPane.showMessageDialog(null,userAnswersArray);
		generateResults(questionsArray.length);
	}
	
	// checking user answers
	public void checkAnswer(String actualAnswer,String userAnswer,int randomNumber) {
		if(actualAnswer.equals(userAnswer)) {
			generateCorrectAnswerMessage(randomNumber);
			countCorrectAnswer ++;
		}
		else {				
			generateIncorrectAnswerMessage(randomNumber);
			}		
					
	}
	
	// generating messages
    public void generateCorrectAnswerMessage(int randomNumber) {
    	String correctAnswerArray [] = {"Excellent!","Good!","Keep up the good work!", "Nice work!"};
    	switch (randomNumber) {
		case 1: {
			JOptionPane.showMessageDialog(null, correctAnswerArray[0]);
			break;
		}
		case 2:{
			JOptionPane.showMessageDialog(null, correctAnswerArray[1]);
			break;
		}
		case 3:{
			JOptionPane.showMessageDialog(null, correctAnswerArray[2]);
			break;
		}
		case 4:{
			JOptionPane.showMessageDialog(null, correctAnswerArray[3]);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + randomNumber);
		}
	}
    
    public void generateIncorrectAnswerMessage(int randomNumber) {
    	String incorrectAnswerArray [] = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying.."};
    	switch (randomNumber) {
    	case 1: {
			JOptionPane.showMessageDialog(null, incorrectAnswerArray[0]);
			break;
		}
		case 2:{
			JOptionPane.showMessageDialog(null, incorrectAnswerArray[1]);
			break;
		}
		case 3:{
			JOptionPane.showMessageDialog(null, incorrectAnswerArray[2]);
			break;
		}
		case 4:{
			JOptionPane.showMessageDialog(null, incorrectAnswerArray[3]);
			break;
		}
    	}
    }
    
    // generating results
    public void generateResults(int totalQuestions) {
    	int correctAnsPercentage = (100 * countCorrectAnswer) / totalQuestions;
    	JOptionPane.showMessageDialog(null, "Number of correct answers : " + countCorrectAnswer + 
    			"\n Number of incorrect answers : " + (totalQuestions - countCorrectAnswer) + 
    			"\n Your percentage is : " + correctAnsPercentage + "\n Great work!");
    }
 
}
