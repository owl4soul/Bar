package bar.drinks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import bar.drinks.Ingredient;

public class Custom extends Drink {
    public Recipe recipe;
    public Map<String, String> consist;

    public Custom(String name, Recipe recipe) {
        this.name = name;
        this.recipe = recipe;
        if (this.checkingAvailable()) {

            this.consist = new HashMap<String, String>(recipe.matrix);
        }
    }

    public boolean checkingAvailable() {
        HashSet<String> tmpConsists = new HashSet<String>(this.recipe.matrix.keySet());
        for (String name : tmpConsists) {
            if (!Ingredient.ingredients.containsKey(name)) {
                System.out.println("Запрошенный ингредиент \"" + name + "\" отсутствует. " +
                        "Создание напитка по данному рецепту невозможно");
                return false;
            }
        }
        return true;
    }



    @Override
    public String toString() {
        return "Custom{" +
                "recipe=" + recipe + consist +
                '}';
    }

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
    public Drink createCustom(String name, Map<String, String> map) {

        Drink custom = new Custom(name);
        Recipe res = new Recipe.BuilderCustom().withAnything(map).build();
        custom = new Custom(name, res);
        return custom;
    }


}
