package bar.drinks;

import bar.Stock;

public class Cappuccino extends Drink {
    Stock stock = new Stock();
    public Cappuccino() {
        super();
        if (stock.getShot() > 1 & stock.getMilk() > 1) {
            new Builder(this).withShot(2).withMilk(1).build();
        } else {
            System.out.println("Чего-то не хватает");
        }

    }
}
