package bar.drinks;

public class Espresso extends Drink implements Menu{
    public static String name = "espresso";

    public Espresso() {
        new Builder(this).withShot(1).build();
    }

    public Espresso(boolean b) {
        if (b) {
            this.addDrinkToMenu();
        } else if (!b) {
            this.removeDrinkFromMenu();
        }
    }

    @Override
    public void addDrinkToMenu() {
        Menu.menu.put(name, new Espresso());
    }

    @Override
    public void removeDrinkFromMenu() {
        Menu.menu.remove(name);
    }
}
