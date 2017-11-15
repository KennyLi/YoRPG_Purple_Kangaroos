//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#31: Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Rogue extends Protagonist {
    public Rogue(String newName) {
        super(newName);
        health = 100;
        strength = 120;
        defense = 35;
        attack = 0.45;
    }

    public String about() {
        String retstr = "The rogue grew up poor, forced to steal in order to ";
        retstr += "survive. His parents couldn't afford to raise him, so they abandoned him ";
        retstr += "at an orphanage. Destined for greatness, he longs for the opportunity ";
        retstr += "to rise to glory. Fast as fury, the rogue strikes quickly, ";
        retstr += "skillfully landing attacks in between pieces of armor.";
        return retstr;
    }

    public void specialize() {
        defense = 30;
        attack = 0.6;  
    }
		
    public void normalize() {
        defense = 35;
        attack = 0.45;
    }
}
