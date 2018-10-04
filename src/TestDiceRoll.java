import java.DiceRoll
public class TestDiceRoll
{
	public static void main(String[] args) 
	{
		DiceRoll dice = new DiceRoll();
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println(dice.roll());
		System.out.println("You have rolled " + numRolls);
		dice.reset();
		System.out.println("You have rolled "  + numRolls);
	}
}

