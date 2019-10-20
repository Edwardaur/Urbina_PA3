import java.security.SecureRandom;
import java.util.Scanner;
public class Multiplication {
	
	private static int LEVEL;
	private static int currentLevel;
	private static Scanner scanner =
	new Scanner(System.in);
	private static SecureRandom random =
	new SecureRandom();

public static void main(String[] args)
{
// Here the variable is set to Level 1
	LEVEL = 1;
	currentLevel = LEVEL;

		while(true)
		{
		int choice = menu();
		//generates two random numbers based on the current Level
		boolean success =
		generateProblem(currentLevel, choice);

		if(success)
		{
		// Here the level goes up by 1
		LEVEL++;
		currentLevel = LEVEL;
		}
			else
			{
			System.out.println("Next Student ");
			}
			}
}

public static int menu() {
	int choice = -1;

	do
	{
	System.out.println("Welcome To Computer Aided Learning");
	System.out.println("4. Division");
	System.out.println("5. Random Mixture");
	System.out.println("6. Exit");
	System.out.print("Enter choice[1,2,3,4,5, or 6] : ");
	//Here the user chooses their level
	choice = scanner.nextInt();
	
	// If the choice is invalid this will be displayed
	if(choice < 1 || choice > 6)
	System.out.println("Incorrect choice. Please enter a valid choice");
	if(choice == 6)
	{
	System.out.println("Thank you");
	System.exit(0);
	}
	} 
	while(choice < 1 || choice > 5);

return choice;
}


public static boolean generateProblem(int level,int choice)
{

	//sets number of questions to 10
	double MAXIMUM_TRIES = 10;
	int qustionCount = 1;
	// double to store percentage
	double percentage=0;
	// to count number of correct answers
	int correct = 0;
	double useranswer;
	boolean success = false;
	// Four different random message for right answer
	String correctMessages[] =
		{"Very Good!", "Excellent!", "Nice Work!","Keep up the good work!"};
	// Four different random message for wrong answer
	String incorrectMessages[] =
		{"Try again.", "Keep trying.","Try once more.", "Don’t give up. "};
	// generate minimum and maximum based on a //student level
	int minimum = (int) Math.pow(10, level - 1);
	int maximum = (int) (Math.pow(10, level) - 1);

		int num1 = random.nextInt(maximum - minimum + 1) + minimum;
		int num2 = random.nextInt(maximum - minimum + 1) + minimum;
		int num3 = random.nextInt(maximum - minimum + 1) + minimum;
		int num4 = random.nextInt(maximum - minimum + 1) + minimum;
		int num5 = random.nextInt(maximum - minimum + 1) + minimum;
		System.out.println("LEVEL-" + level);

		while(qustionCount <= MAXIMUM_TRIES)
		{
			success = false;

			switch(choice){
			case 1:
		// display addition problem
		System.out.print(num1 + " + " + num2 + " = ");
		useranswer =
		additionProblem(num1, num2);
		useranswer = scanner.nextInt();
		if(useranswer == (num1 + num2))
			success = true;
		break;
			case 2:
		// display subtraction problem
		System.out.print(num1 + " - " + num2 + " = ");
		useranswer = 
			success = true;
		break;
			case 3:
		// display multiplication problem
		System.out.print(num1 + " * " + num2 + " = ");
		useranswer=
		multiplicationProblem(num1,num2);
		// read user answer
		useranswer = scanner.nextInt();
		if(useranswer == (num1 * num2))
			success = true;
		break;
			case 4:
		// display division problem
		System.out.print(num1 + " / " + num2 + " = ");
		useranswer =
		divisionProblem(num1, num2);
		// read user answer
		useranswer = scanner.nextInt();
		if(useranswer == (num1 / num2))
			success = true;
		break;
			case 5:


	String randomQuestion =
	new String();
	randomQuestion += num1 + " + " + num2 + " * " + num3 + " / " + num4 + " - " + num5;
	// print random question
	System.out.println(randomQuestion);
	useranswer = randomMixture (num1, num2, num3, num4, num5);
	// read user answer
	double randomAnswer =
			scanner.nextDouble();
	
	if(Math.abs(randomAnswer - result) < 0.01)
		success = true;
	else
		success = false;
	break;
}

	if(success){
}
	System.out.println(correctMessages[random.nextInt(correctMessages.length)]);

	qustionCount++;
	correct++;
	
	num1 = random.nextInt(maximum - minimum + 1) + minimum;
	num2 = random.nextInt(maximum - minimum + 1) + minimum;
}
{
	System.out.println(incorrectMessages[random.nextInt(incorrectMessages.length)]);
	qustionCount++;
}
	percentage = (correct / MAXIMUM_TRIES) * 100.0;
	if(percentage >= 75)
{
	System.out.println("Congratulations,You are ready to go to next level!");
{
	System.out.println("Please ask your teacher for extra help");
	success = false;
}
return success;
}
}

private static double randomMixture(int num1, int num2, int num3, int num4, int num5)
{

	int multiplication =
	multiplicationProblem(num2, num3);
	int div =
	(int) divisionProblem(multiplication, num4);
	int sum = additionProblem(num1, div);
	int sub = subtractionProblem(sum, num5);
	return sub;
}

private static double divisionProblem(int num1,
	int num2)
	{
	return (double) (num1 / num2);
}

private static int subtractionProblem(int num1, int num2)
{
return num1 - num2;
}

private static int additionProblem(int num1, int num2)
{
return num1 + num2;
}

public static int multiplicationProblem(int num1,int num2)
{
return num1 * num2;
}}


