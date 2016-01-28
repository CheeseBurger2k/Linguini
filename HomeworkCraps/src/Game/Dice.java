package Game;

import java.util.Random;


public class Dice {
private int m_value;
public int roll(){
	Random rn = new Random();
	int i = rn.nextInt() % 6;
	m_value = Math.abs(i)+1;
	return m_value;
}//end method
public int getValue(){
	return m_value;
}
}