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

//    public Map<Integer, Drink> menu = new LinkedHashMap<Integer, Drink>();
//
//     {
//        menu.put(1, new Espresso()); //espresso
//        menu.put(2, new Cappuccino()); //cappuccino
//        menu.put(3, new Drink.Builder().withShot(1).withWater(1).build());//americano
//    }

    public Drink classicDrink(int num) {
        if (num == 1) {
            System.out.println("1111");
        }
        switch (num) {
            case 1:
                new Drink.Builder(this).withShot(88).build();
                return this;
        }
        return null;
    }


    public Drink totalDrink(int num) {
        switch (num) {
            case 0:
                return this;
            case 1:
                return new Builder(this).withShot(1).build();

            case 2:
                return new Builder(this).withMilk(1).build();

            case 3:
                return new Builder(this).withWater(1).build();

            case 4:
                return new Builder(this).withSugar(1).build();

            case 5:
                return new Builder(this).withCinnamon(1).build();

            case 6:
                return new Builder(this).withIce(1).build();

        }
        return this;
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

        //Метод, собирающий билд!
        public Drink build() {
            return new Drink();
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
