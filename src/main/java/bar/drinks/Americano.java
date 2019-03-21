package bar.drinks;

public class Americano extends Drink {
    public static String name = "americano";
    public static int id = 3;
    public Americano() {
        new Builder().withShot(1).withWater(1).build();
    }

}
