// Abstract class with abstract method and concrete subclasses
class Game
{
    abstract class Character
    {
        abstract void attack();
    }

    class Warrior extends Character 
    {
        void attack()
        {
            System.out.println("Warrior attacks with sword!");
        }
    }

    class Archer extends Character
    {
        void attack()
        {
            System.out.println("Archer shoots an arrow!");
        }
    }

    Character getCharacter(String type) 
    {
        if (type.equals("Warrior"))
        	return new Warrior();
        else if (type.equals("Archer"))
        	return new Archer();
        else
        	return null;
    }
}

public class AbstractMethodConcreteSubExample9
{
	public static void main(String[] args)
	{
        Game myGame = new Game();
        Game.Character hero = myGame.getCharacter("Warrior");//Warrior
        hero.attack(); // Output: Warrior attacks with sword!
    }
}
