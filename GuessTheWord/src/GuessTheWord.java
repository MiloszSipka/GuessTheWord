import java.util.ArrayList;
import java.util.Random;

public class GuessTheWord {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Space");
		words.add("Ship");
		words.add("Potato");
		words.add("Alphabet");
		words.add("Monday");
		words.add("Paris");
		words.add("Meat");
		
		Random random = new Random();
		int randomNumber = random.nextInt(7);
		String randomWord = words.get(randomNumber);
		System.out.println(randomWord);
		
	}

}
