package bar;
//Цены считаем здесь

import bar.drinks.Drink;

public class Bar {
    public static int shotPrice = 20;
    public static int milkPrice = 30;
    public static int waterPrice = 3;
    public static int sugarPrice = 1;
    public static int cinnamonPrice = 2;
    public static int icePrice = 4;

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
