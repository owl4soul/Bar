package bar.drinks;

public class Espresso extends Drink {
    public Espresso() {
        new Builder(this).withShot(1).build();
    }
}
