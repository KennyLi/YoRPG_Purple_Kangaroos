public class Skeleton extends Monster {
    public Skeleton() {
        super();
        health = 125;
        strength = (int)(Math.random() * 45) + 30;
    }
    public static String aboutSkeleton() {
        String retstr = "Skeletons, it's what you picture, skull and bones.";
        retstr += "Heroes beware these skellies are strong boys.";
        return retstr;
    }
}
