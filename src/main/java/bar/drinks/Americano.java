package bar.drinks;

public class Americano extends Drink {
    public Americano() {
        new Builder().withShot(1).withWater(1);
    }
}
