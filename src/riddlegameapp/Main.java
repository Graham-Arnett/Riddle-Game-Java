package riddlegameapp;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		System.out.println("Welcome to my riddle app.\nThe way this works is a riddle will be spit out, and you will give a single word answer.");
		 String[] questions = new String[]{"When you say my name I cease to exist: ", "Poor men have me but rich men don't: ","I have a face and a tail, but no body: "};
         
         String[] answers = new String[] {"silence", "nothing","coin"};
		do 
		{
		int score = 0;
		
		for (int i = 0; i < questions.length; i++) 
		{
			System.out.print(questions[i]);
			String entry = scanner.next();
			if(entry == answers[i].toLowerCase())
			{
				System.out.println("That is CORRECT!");
				score++;
			}
			else 
			{
				System.out.println("WRONG!");
			}
		}

		System.out.println("\n\nYour score was: " + score);
		System.out.print("Would you like to go again? (y/n): ");	
		choice = scanner.next();	
		}while(choice.equalsIgnoreCase("y"));
	}

}
