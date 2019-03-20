package bar;
//Цены считаем здесь

import bar.drinks.Drink;

public class Bar {
    private static int shotPrice = 20;
    private static int milkPrice = 30;
    private static int waterPrice = 3;
    private static int sugarPrice = 1;
    private static int cinnamonPrice = 2;
    private static int icePrice = 4;

    public static int countTotalPrice(Drink drink) {
        int totalShot = drink.getShot() * shotPrice;
        int totalMilk = drink.getMilk() * milkPrice;
        System.out.println(totalMilk+totalShot);
        return totalShot + totalMilk;
    }


}
