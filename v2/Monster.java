//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#28: Ye Olde Role Playing Game
//2017-11-08

public class Monster extends Character{
    //instance variables
    private int health;
    private int strength;
    private int defense;
    private double attack;
    
    //constructor
    public Monster(){
        health = 150;
        strength = (int)(Math.random() * 45) + 20;
        defense = 20;
        attack = 1.0;
    }
        
    public boolean isAlive(){
	//the monster is defined as "alive" if it has positive value for health
        return health > 0;
    }
        
    public int getDefense(){
        return defense;   //accesses defense val
    }
    
    public void lowerHP(int damage){   
        health -= damage;    //no return value necessary, lowers health by value damage
      
    }
		
    public int attack(Protagonist protagonist){
        int damage = (int)(strength * attack) - protagonist.defense; //calculates dmg
	if (damage < 0) {
	    damage = 0;
	}
	protagonist.lowerHP(damage);
        return damage;
    }
}
