//Purple Kangaroos- Clarence Cheng, Kenny Li, Simon Tsui
//APCS1 pd 1
//HW#31: Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Jester extends Protagonist {
    public Jester(String newName) {
        super(newName);
        health = (int)(Math.random() * 50) + 100;
        strength = (int)(Math.random() * 60) + 70;
    }

    public String about() {
        String retstr = "Deadly even to himself, the jester fights with ";
        retstr += "fanatical might. The jester's drinking addiction prevents him from ";
        retstr += "being the model hero. Not helping is his two-faced personality, with ";
        retstr += "righteous justice as one, and maniacal revenge as the other. ";
        retstr += "Flip a coin, he is as unpredictable as it gets.";
        return retstr;
    }

    public void specialize() {
        defense = (int)(Math.random() * 40) + 20;
        attack = Math.random();
    }
	 
    public void normalize() {
        defense = 40;
        attack = 0.4;
    }
}
