public class Character{ 
//attributes
    private int health;
    private int strength;
    private int defense;
    private double attack;
    
    public boolean isAlive(){
        //the character is defined as "alive" if it has positive value for health
        return health > 0;
    }
  
    public int getDefense(){
        return defense;   //returns defense val
    }
 
    public void lowerHP(int damage){   
        health -= damage;    //no return value necessary, lowers health by value damage
    }

    public int attack(Character character){
        int damage = (int)(strength * attack) - character.getDefense(); //calculates dmg
	if (damage < 0) {s
		damage = 0;
    }
	character.lowerHP(damage);
	return damage;
    }
}
