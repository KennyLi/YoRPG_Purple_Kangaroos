//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#31: Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Tank extends Protagonist {
    public Tank(String newName) {
        super(newName);
        health = 150;
        strength = 80;
        defense = 45;
        attack = 0.35;
    }

    public String about() {
        String retstr = "The strongest of the strong, the tank spends his days ";
        retstr += "at the gym getting gains. Legend has it he is so buff he doesn't even ";
        retstr += "need armor. Dependable at being a frontline, he is a little slow, and ";
        retstr += "lacks the damage necessary to take down all the enemies.";
        return retstr;
    }

    public void specialize() {
        defense = 50;
        attack = .3;
    }
		
    public void normalize() {
        defense = 45;
        attack = 0.35;
    }
}
