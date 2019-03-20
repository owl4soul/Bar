package bar;

import bar.drinks.Drink;

public class Stock {
    private int shot = 10;
    private int milk = 10;
    private int water = 999;
    private int sugar = 999;
    private int cinnamon = 999;
    private int ice = 999;

    public void showStock() {
//        System.out.println("Подсчитываю остатки...");
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

    public void setShot(int shot) {
        if (shot < 0) {
            System.out.println("Не хватает кофе!");
        } else {
            this.shot = shot;
        }
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        if (milk < 0) {
            System.out.println("Не хватает молока!");
        } else {
            this.milk = milk;
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
