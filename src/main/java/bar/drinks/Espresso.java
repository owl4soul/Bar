package bar.drinks;

public class Espresso extends Drink {
    public static String name = "espresso";
    public static int id = 1;


    public Espresso() {
        new Builder(this).withShot(1).build();
    }

}
