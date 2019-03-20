package bar.drinks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Drink {
    private int shot;
    private int milk;
    private int water;
    private int sugar;
    private int cinnamon;
    private int ice;

    public static Map<Integer, Drink> menu = new LinkedHashMap<Integer, Drink>();
    static {
        menu.put(1, new Espresso());
        menu.put(2, new Cappuccino());
        menu.put(3, new Americano());
    }

    public Map<Integer, Builder> supplements = new LinkedHashMap<Integer, Builder>();
    {
        supplements.put(1, new Builder(this).withShot(1));
        supplements.put(2, new Builder(this).withMilk(1));
    }


    //Nested Class
    public static class Builder {
        private Drink drink;

        //Конструктор
        public Builder() {
            this.drink = new Drink();
        }

        public Builder(Drink drink) {
            this.drink = drink;
        }

        //Методы, устанавливающие параметры
        public Builder withShot(int shot) {
            this.drink.shot += shot;
            return this;
        }

        public Builder withMilk(int milk) {
            this.drink.milk += milk;
            return this;
        }

        public Builder withWater(int water) {
            this.drink.water += water;
            return this;
        }

        public Builder withSugar(int sugar) {
            this.drink.sugar += sugar;
            return this;
        }

        public Builder withCinnamon(int cinnamon) {
            this.drink.cinnamon += cinnamon;
            return this;
        }

        public Builder withIce(int ice) {
            this.drink.ice += ice;
            return this;
        }
    }


    //Getter anad Setters
    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
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
