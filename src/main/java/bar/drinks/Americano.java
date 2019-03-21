package bar.drinks;

public class Americano extends Drink implements Menu {
    public static String name = "americano";
    public static int id = 3;
    public Americano() {
        new Builder().withShot(1).withWater(1).build();
    }

    public Americano(boolean b) {
        if (b) {
            this.addDrinkToMenu();
        } else if (!b) {
            this.removeDrinkFromMenu();
        }
    }


    @Override
    public void addDrinkToMenu() {
        Menu.menu.put(name, new Americano());
    }

    @Override
    public void removeDrinkFromMenu() {
        Menu.menu.remove(name);
    }
}
