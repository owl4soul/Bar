package bar.drinks;

import bar.Stock;


public class Drink {
    private int shot;
    private int milk;
    private int water;
    private int sugar;
    private int cinnamon;
    private int ice;

    public Drink() {
    }

    public Drink(Drink drink) {
        this.shot = drink.shot;
        this.milk = drink.milk;
        this.water = drink.water;
        this.sugar = drink.sugar;
        this.cinnamon = drink.cinnamon;
        this.ice = drink.ice;
    }

    public void showDrink() {
        System.out.println("Ваш напиток состоит из: ");
        System.out.println("шотов: " + shot);
        System.out.println("молока: " + milk);
        System.out.println("воды: " + water);
        System.out.println("корицы: " + cinnamon);
        System.out.println("сахара: " + sugar);
        System.out.println("льда: " + ice);
    }

    public Drink classicDrink(int num) {
        switch (num) {
            case 1:
                new Builder(this).withShot(1).build(); //espresso
                return this;
            case 2:
                return new Builder(this).withShot(2).withMilk(1).build(); //cappuccino
            case 3:
                return new Builder(this).withShot(1).withWater(1).build(); // americano
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
        public Stock stock = new Stock();

        //Конструктор
        public Builder() {
            this.drink = new Drink();
        }

        public Builder(Drink drink) {
            this.drink = drink;
        }

        //Методы, устанавливающие параметры
        public Builder withShot(int shot) {

            if (stock.setShot(stock.getShot() - shot)) {
                this.drink.shot += shot;
                return this;
            } else {
                return this;
            }

        }

        public Builder withMilk(int milk) {

            if (stock.setMilk(stock.getMilk() - milk)) {
                this.drink.milk += milk;
                return this;
            } else {
                return this;
            }
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
