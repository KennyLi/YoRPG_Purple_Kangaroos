//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#31: Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Tank extends Protagonist {
    public Tank(String newName) {
        super(newName);
        health = 150;
        strength = 80;
    }
    public static String aboutTank() {
        String retstr = "The strongest of the strong, the tank spends his days
        at the gym getting gains. Legend has it he is so buff he doesn't even
        need armor. Dependable at being a frontline, he is a little slow, and
        lacks the damage necessary to take down all the enemies.";
        return retstr;
    }
}
