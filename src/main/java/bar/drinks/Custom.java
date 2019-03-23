package bar.drinks;

import java.util.HashMap;
import java.util.Map;

import bar.drinks.Ingredient;

public class Custom extends Drink {


    static Map<String, Drink> customDrinks = new HashMap<String, Drink>();
    static {{
        customDrinks.put("qwer", new Builder().withWater(6).withCinnamon(2).build());
        customDrinks.put("frappuccino", new Builder(new Cappuccino()).withIce(2).build());
    }}

    public Custom() {
    }

    public Custom(String name) {
        this.name = name;
    }

    public Custom(Drink drink, String name) {
        super(drink);
        this.name = name;
    }



//    public HashMap<String, Integer> choseDozen(String ingredient, int count) {
//
//    }

    //    @Override
    public static Drink createCustom(String name, Map<String, String> map) {

        Drink custom = new Custom(name);
        for (Map.Entry<String,String> entry: map.entrySet()) {
            String nameOfIngredient = entry.getKey();
            int count = Integer.parseInt(entry.getValue());
            Ingredient ingre = Ingredient.ingredients.get(nameOfIngredient);
            custom.totalDrink(ingre.id);
        }
        return custom;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "name='" + name + '\'' +
                ", shot=" + shot +
                ", milk=" + milk +
                ", water=" + water +
                ", sugar=" + sugar +
                ", cinnamon=" + cinnamon +
                ", ice=" + ice +
                '}';
    }
}
