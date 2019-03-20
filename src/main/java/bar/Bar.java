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
        int totalWater = drink.getWater() * waterPrice;
        int totalSugar = drink.getSugar() * sugarPrice;
        int totalCinnamon = drink.getCinnamon() * cinnamonPrice;
        int totalIce = drink.getIce() * icePrice;
        int totalPrice = totalShot + totalMilk + totalWater + totalSugar + totalCinnamon + totalIce;
        System.out.println("Напиток на сумму: " + totalPrice);
        return totalPrice;
    }


}
