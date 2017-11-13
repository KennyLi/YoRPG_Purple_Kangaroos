//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#28: Ye Olde Role Playing Game
//2017-11-08

public class Protagonist extends Character{
    
    //constructor
    public Protagonist(String newName){
        name = newName;
        health = 125;
        strength = 100;
        defense = 40;
        attack = 0.4;
    }
		
    public String getName(){
        return name;      //returns name val
    }
		
    public int attack(Monster monster){
        int damage = (int)(strength * attack) - monster.getDefense(); //calculates dmg
	if (damage < 0) {
	    damage = 0;
	}
	
	monster.lowerHP(damage);
        return damage;
    }
    
    public void specialize(){
        defense = 20; //performs special attack, lowers defense, increases atttack rating
        attack = .75;
    }
		
    public void normalize(){
        defense = 40;     //reverses effects of specialize
        attack  = .4;
    }
}
