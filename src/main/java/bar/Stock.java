package bar;

import bar.drinks.Drink;

public class Stock {
    private static int shot = 15;
    private static int milk = 15;
    private static int water = 999;
    private static int sugar = 999;
    private static int cinnamon = 999;
    private static int ice = 999;

    public void showStock() {
        System.out.println("Остаток ингредиентов на складе: ");
        System.out.println("шотов: " + shot);
        System.out.println("молока: " + milk);
        System.out.println("воды: " + water);
        System.out.println("корицы: " + cinnamon);
        System.out.println("сахара: " + sugar);
        System.out.println("льда: " + ice);

    }



    //TODO Нужен билдер для склада

    //TODO: Не предупредит сразу, если ингредиенты отсутствуют
//    //Write off from stock
//    public void writeOff(Drink drink) {
//        this.setShot(this.shot -= drink.getShot());
//        this.setMilk(this.milk -= drink.getMilk());
//        this.water -= drink.getWater();
//        this.sugar -= drink.getSugar();
//        this.cinnamon -= drink.getCinnamon();
//        this.ice -= drink.getIce();
//    }

    public int getShot() {
        return shot;
    }

    public boolean setShot(int shot) {
        if (shot < 0) {
            System.out.println("Не хватает кофе!");
            return false;
        } else {
            this.shot = shot;
            return true;
        }
    }

    public int getMilk() {
        return milk;
    }

    public boolean setMilk(int milk) {
        if (milk < 0) {
            System.out.println("Не хватает молока!");
            return false;
        } else {
            this.milk = milk;
            return true;
        }
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getCinnamon() {
        return cinnamon;
    }

    public void setCinnamon(int cinnamon) {
        this.cinnamon = cinnamon;
    }

    public int getIce() {
        return ice;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }
}
