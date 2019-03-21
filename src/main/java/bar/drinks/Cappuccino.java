package bar.drinks;

import bar.Stock;

public class Cappuccino extends Drink implements Menu {
    public static String name = "cappuccino";

    Stock stock = new Stock();

    public Cappuccino() {
        super();
        if (stock.getShot() > 1 & stock.getMilk() > 1) {
            new Builder(this).withShot(2).withMilk(1).build();
        } else {
            System.out.println("Чего-то не хватает");
        }

    }
    public Cappuccino(boolean b) {
        if (b) {
            this.addDrinkToMenu();
        } else if (!b) {
            this.removeDrinkFromMenu();
        }
    }

    @Override
    public void addDrinkToMenu() {
        Menu.menu.put(name, new Cappuccino());
    }

    @Override
    public void removeDrinkFromMenu() {
        Menu.menu.remove(name);
    }
}
