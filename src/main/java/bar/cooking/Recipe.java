package bar.cooking;

import bar.cooking.item.Item;
import bar.cooking.product.Addition;
import bar.cooking.product.Drink;
import bar.cooking.product.Ingredient;

import java.util.*;

public class Recipe {
    private static final Map<String, Recipe> recipes = new HashMap<String, Recipe>();

    //actually, we don't have to store the instances in the static members but add them to list instead
    public static final Recipe cappuccino = new Recipe("Cappuccino").addCost(Ingredient.shot, 2).addCost(Ingredient.milk, 1);
    public static final Recipe americano = new Recipe("Americano").addCost(Ingredient.shot, 1).addCost(Ingredient.water, 1);
    public static final Recipe espresso = new Recipe("Espresso").addCost(Ingredient.shot, 1);

    private List<Item> costs = new ArrayList<Item>();

    private final String name;

    public Recipe(String name) {
        this.name = name;
        recipes.put(name, this);
    }

    public static Set<String> getRecipeNames() {
        return recipes.keySet();
    }

    public static Recipe getRecipe(String name) {
        return recipes.get(name);
    }

    public Recipe addCost(Ingredient ingredient, int count) {
        costs.add(new Item(ingredient, count));
        return this;
    }


    public Drink addOptional(Drink drink, Ingredient addition) {
        if (Addition.canBeAdded(drink, (Addition) addition)) {
            drink.addIngredientItem(new Item(addition));
            return drink;
        } else {
            return drink;
        }
    }


    public boolean checkCanCook(Store store) {
        for (Item item : costs) {
            if (!store.hasResources(item.product, item.count)) {
                return false;
            }
        }
        return true;
    }

    //assume that Store 'production' stores all products we have produced
    public Drink cook(Store producedItems) {
        Drink drink = new Drink(name);
        for (Item item : costs) {
            drink.addIngredientItem(item);
        }
        this.addOptional(drink, Ingredient.ice);
        producedItems.add(new Item(drink));
        return drink;
    }

    public void deductCost(Store store) {
        for (Item item : costs) {
            store.removeResource(item.product, item.count);
        }
    }
}
