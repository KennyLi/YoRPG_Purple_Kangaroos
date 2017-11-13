//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#28: Ye Olde Role Playing Game
//2017-11-08

public class Monster extends Character{
    
    //constructor
    public Monster(){
        health = 150;
        strength = (int)(Math.random() * 45) + 20;
        defense = 20;
        attack = 1.0;
    }
    
    public int attack(Protagonist protagonist){
        int damage = (int)(strength * attack) - protagonist.getDefense(); //calculates dmg
	if (damage < 0) {
	    damage = 0;
	}
	protagonist.lowerHP(damage);
        return damage;
    }
}
