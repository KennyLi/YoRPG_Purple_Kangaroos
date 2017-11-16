//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#31: Ye Olde Role Playing Game, Realized
//2017-11-15

public class Healer extends Protagonist {
    public Healer(String newName) {
        super(newName);
        health = 200;
        strength = 100;
    }

    public String about() {
        String retstr = "Born with magic infused in its blood, the healer is able to ";
        retstr += "rapidly heal wounds in the middle of combat. While not the strongest ";
				retstr += "of heroes, the healer's exceptional ability to restore health makes it ";
				retstr += "stand apart as it can whittles the enemy down and heal itself of its wounds.";
        return retstr;
    }

    public void specialize() {
        health += 100;
				if (health > 200) {
						health = 200;
				}
				defense = 45;
				attack = 0.3;
    }
		
    public void normalize() {
        defense = 5;
        attack = 0.4;
    }
}
