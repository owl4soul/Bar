package bar.cooking;

import bar.cooking.item.Item;
import bar.cooking.product.Drink;
import bar.cooking.product.Ingredient;

import java.util.Set;

public class Bar {
    private Store store;
    private Store producedItems; //keep in mind of it stores all products we've produced

    public Bar() {
        store = new Store()
                .add(new Item(Ingredient.shot, 10))
                .add(new Item(Ingredient.milk, 10))
                .add(new Item(Ingredient.water, 100))
                .add(new Item(Ingredient.ice, 200))
                .add(new Item(Ingredient.sugar, 100));

        producedItems = new Store();
    }

    public Drink buy(String name) {
        Recipe recipe = Recipe.getRecipe(name);
        if (!recipe.checkCanCook(store)) {
            System.out.println("Failed to create a drink: " + name + " we don't have enough ingredients");
            return null;
        }

        recipe.deductCost(store);

        return recipe.cook(producedItems);
    }

    public static void main(String[] args) {
        Bar bar = new Bar();

        System.out.println("Please find available drinks below");
        Set<String> availableRecipes = Recipe.getRecipeNames();
        for (String name : availableRecipes) {
            System.out.println(name);
        }

        //user inputs are here
        for (int i = 0; i < 2; i++) {
            bar.buy("Cappuccino");
        }

        for (int i = 0; i < 1; i++) {
            bar.buy("Americano");
        }

        for (int i = 0; i < 6; i++) {
            bar.buy("Espresso");
        }

        System.out.println("There are ingredients we still have");
        System.out.println(bar.store);


        System.out.println("There are products we have produced so far");
        System.out.println(bar.producedItems);
    }
}
