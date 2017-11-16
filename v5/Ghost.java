public class Ghost extends Monster {
    public Ghost() {
        super();
        health = (int)(Math.random() * 70) + 115;
        strength = (int)(Math.random() * 80);
    }

    public static String aboutGhost() {
        String retstr ="Boo! Don't let their transparent bodies fool you, they";
        retstr += "can still pack quite the punch. Who you gonna call?";
        return retstr;
    }
}
