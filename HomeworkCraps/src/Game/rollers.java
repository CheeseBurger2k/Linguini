package Game;

public class rollers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		do{
			die1.roll();
			die2.roll();
			score = die1.getValue()+die2.getValue();
			
			if ((score == 7)||(score == 11))
				System.out.println("Winner!" + die1.getValue() + "  " + die2.getValue());
			
		System.out.println("I just rolled " + die1.getValue());		}while (die1.getValue() != 1);
		System.exit(0);
	}

}
