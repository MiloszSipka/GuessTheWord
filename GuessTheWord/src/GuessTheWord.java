import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {

	public static void main(String[] args) {
	String drawedWord = drawTheWord();
	char[] drawedChar = drawedWord.toCharArray();
	char[] copyOfDraw = new char[drawedChar.length];
	Scanner scanner = new Scanner(System.in);
	for(int i = 0; i < copyOfDraw.length; i++)
	{
		copyOfDraw[i] = '?';
	}

	
	while(! isEqual(drawedChar, copyOfDraw)) {
		System.out.println("Press 1 if you want to guess the letter");
		System.out.println("Press 2 if you want to guess the word");
		int playerChoice = scanner.nextInt();
		if(playerChoice == 1) {
			System.out.println("What letter do you think can be a part of the word?");
			char playerGuess = scanner.next().charAt(0);
			
		for(int i = 0; i < drawedChar.length; i++) {
				if(drawedChar[i] == playerGuess) {
					copyOfDraw[i] = drawedChar[i];
					System.out.println(copyOfDraw);
				}
		}
		System.out.println("This letter is not part of the word");
		}
		
		else if(playerChoice == 2) {
			System.out.println("What word do you think is under question marks?");
			String playerGuess = scanner.next();
			char[] playerGuessArray = playerGuess.toCharArray();
			
			try {
			for(int i = 0; i < drawedChar.length; i++) {
				if(playerGuessArray[i] == drawedChar[i]) {
					copyOfDraw[i] = playerGuessArray[i];
				}
			}
			} catch (Exception e){
		
			}
			
			if(isEqual(drawedChar, copyOfDraw)) {
				System.out.println("You won!");
			}
			else
			{
				System.out.println("This is not the correct word!");
			}
			
		}
		else
			System.out.println("You choose the wrong number");
	}
	}
	

			
	static String drawTheWord() {
		ArrayList<String> words = new ArrayList<String>();
		words.add("space");
		words.add("ship");
		words.add("potato");
		words.add("alphabet");
		words.add("monday");
		words.add("paris");
		words.add("meat");
		
		
		Random random = new Random();
		int randomNumber = random.nextInt(7);
		String randomWord = words.get(randomNumber);
		
		return randomWord;
	}
	static boolean isEqual(char[] array1, char[] array2) {
		int correctLetter = 0;
		for(int i = 0; i < array1.length; i++)
		{
			if(array1[i] == array2[i]) {
			correctLetter++;
			}
		}
		if(correctLetter == array1.length) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
