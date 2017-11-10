//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#28: Ye Olde Role Playing Game
//2017-11-08

public class Protagonist{
    //instance variables
    public String name;
    public int health;
    public int strength;
    public int defense;
    public double attack;
    
    //constructor
    public Protagonist(String newName){
        name = newName;
        health = 125;
        strength = 100;
        defense = 40;
        attack = 0.5;
    }
		
    public boolean isAlive(){
        //the character is defined as "alive" if it has positive value for health
        return health > 0;
    }
		
    public int getDefense(){
        return defense;   //returns defense val
    }
		
    public String getName(){
        return name;      //returns name val
    }
		
    public void lowerHP(int damage){   
        health -= damage;    //no return value necessary, lowers health by value damage
    }
		
    public int attack(Monster monster){
        int damage = (int)(strength * attack) - monster.defense; //calculates dmg
        return damage;
    }
    
    public void specialize(){
        defense -= 2; //performs special attack, lowers defense, increases atttack rating
        attack += 0.5;
    }
		
    public void normalize(){
        defense += 2;     //reverses effects of specialize
        attack -= 0.5;
    }
}
