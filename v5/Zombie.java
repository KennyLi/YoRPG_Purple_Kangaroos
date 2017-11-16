public class Zombie extends Monster {
    public Zombie() {
        super();
        health = 175;
        strength = (int)(Math.random() * 45) + 10;
    }
    public static String aboutZombie() {
        String retstr = "Brainzzz. Its what zombies crave. They might be slow,";
        retstr += "but these buggers are bulky and persistent.";
        return retstr;
    }
}
