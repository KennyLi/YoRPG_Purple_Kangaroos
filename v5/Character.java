//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#30: Ye Olde Role Playing Game
//2017-11-12

public class Character{ 
    //attributes
    protected int health;
    protected int strength;
    protected int defense;
    protected double attack;
    
    public boolean isAlive() {
        //the character is defined as "alive" if it has positive value for health
        return health > 0;
    }
  
    public int getDefense() {
        return defense;   //returns defense val
    }
 
    public void lowerHP(int damage) {   
        health -= damage;    //no return value necessary, lowers health by value damage
    }

    public int attack(Character character) {
        int damage = (int)(strength * attack) - character.getDefense(); //calculates dmg
        if (damage < 0) {
            damage = 0;
	}
        character.lowerHP(damage);
        return damage;
    }
}
