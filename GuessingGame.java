import java.util.*;
public class GuessingGame 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		String d;
		int computerNumber = (int) (Math.random()*100 + 1);
		int userAnswer = 0;
		int count = 1;
		while (userAnswer != computerNumber)
		{
			System.out.println("\nENTER THE NUMBER");
			userAnswer= sc.nextInt();
			d=determineGuess(userAnswer, computerNumber);
			System.out.println(d);
			System.out.println("NO.OF TIMES GUEESED : "+count);
			count++;
		}
		System.out.println("\nTHE GAME ENDS.");
	}
	public static String determineGuess(int userAnswer, int computerNumber)
	{
		if (userAnswer <=0 || userAnswer >100) 
		{
			return "Your guess is invalid";
		}
		else if (userAnswer == computerNumber )
		{
			System.out.println("The correct guess would be : " + computerNumber);
			return "YOU GUESSED IT CORRECT: "+userAnswer;
		}
		else if (userAnswer > computerNumber) 
		{
			return "Your guess is high, Try again. ";
		}
		else if (userAnswer < computerNumber) 
		{
			return "Your guess is low, Try again. ";
		}
		else 
		{
			return "Your guess is incorrect\n ";
		}
	}
}