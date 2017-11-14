//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#31: Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Rogue extends Protagonist {
    public Rogue(String newName) {
        super(newName);
        health = 100;
        strength = 120;
    }
    public static String aboutRogue(){
        String retstr = "The rogue grew up poor, forced to steal in order to
        survive. His parentscouldn't afford to raise him, so they abandoned him
        at an orphanage. Destined for greatness, he longs for the opportunity
        to rise to glory. Fast as fury, the rogue strikes quickly,
        skillfully landing attacks in between pieces of armor.";
        return retstr;
    }
}
