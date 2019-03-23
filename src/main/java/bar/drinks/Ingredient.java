package bar.drinks;

import bar.Bar;

import java.util.*;


public class Ingredient {
    public String name;
    int id;
    public int cost;

    public static final Ingredient SHOT = new Ingredient("shot", 1, Bar.shotPrice);
    public static final Ingredient MILK = new Ingredient("milk", 2,  Bar.milkPrice);
    public static final Ingredient WATER = new Ingredient("water", 3, Bar.waterPrice);
    public static final Ingredient SUGAR = new Ingredient("sugar", 4, Bar.sugarPrice);
    public static final Ingredient CINNAMON = new Ingredient("cinnamon", 5, Bar.cinnamonPrice);
    public static final Ingredient ICE = new Ingredient("ice", 6, Bar.icePrice);

    static List<Ingredient> listIngredients = Arrays.asList(SHOT, MILK, WATER, SUGAR, CINNAMON, ICE);


    static Map<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

    public Ingredient() {
    }

    static {{
        for (Ingredient i : listIngredients) {
            ingredients.put(i.name, i);
        }
    }}


    public Ingredient(String name, int id, int cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    public static void createIngredient(String name, int id, int cost) {
        Ingredient created = new Ingredient(name, id, cost);
        ingredients.put(created.name, created);
    }
}
