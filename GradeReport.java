//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 8; Working with the switch statement and for loops
//Writing a program using the switch statement named GradeReport that reads a grade from the user
//04-08-2014

import java.util.Scanner;


public class GradeReport {

	public static void main(String[] args) {

		// initialize variables
		int grade = 0;
		int tries = 0;
		int category = 0;
		boolean  isGradeEnteredCorrectly = false;

		Scanner userInput = new Scanner(System.in);

		do
		{
			while (tries <= 3)
			{
				System.out.println("Enter a grade between 0 and 100: ");
				grade = userInput.nextInt();				

				if (grade < 0 || grade > 100)
				{
					System.out.println("Error: You must enter an integer between 0 and 100");
					tries++;
				}
				else
				{
					tries = 4;
					isGradeEnteredCorrectly = true;
					category = grade / 10;

					if (category < 6)
					{
						category = 6;
					}

					switch (category)
					{
					case 10:
						System.out.println("Perfect score! Job well done!");
						break;

					case 9:
						System.out.println("Excellent! Well above average!");
						break;

					case 8: 
						System.out.println("Nice Job! Above average!");
						break;

					case 7:
						System.out.println("Average.");
						break;

					case 6:
						System.out.println("Below average...you should see the professor to clarify the material...presented in class.");
						break;

					default:
						System.out.println("Something went wrong there is no grade to evaluate!");						
					}
				}				
			}
			if (!isGradeEnteredCorrectly)
			{
				System.out.println("You have exceeded the number of tries");
				isGradeEnteredCorrectly = true;
			}

		} while (!isGradeEnteredCorrectly); 

		userInput.close();
	}
}
