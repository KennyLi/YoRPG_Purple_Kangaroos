//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#28: Ye Olde Role Playing Game
//2017-11-08

public abstract class Protagonist extends Character{
    //attribute
    protected String name = "Bob";
		
    //constructor
    public Protagonist(String newName){
        name = newName;
        health = 125;
        strength = 100;
        defense = 40;
        attack = 0.4;
    }

    //abstract methods
    public abstract void normalize();
    public abstract void specialize();
    public abstract String about();
		
    public String getName(){
        return name;      //returns name val
    }
		
    public int attack(Monster monster) {
        int damage = (int)(strength * attack) - monster.getDefense(); //calculates dmg
        if (damage < 0) {
            damage = 0;
        }
        monster.lowerHP(damage);
        return damage;
    }
}
