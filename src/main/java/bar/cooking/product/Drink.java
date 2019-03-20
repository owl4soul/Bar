package bar.cooking.product;

import bar.cooking.item.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drink extends Product {
    private List<Item> ingredientItems = new ArrayList<Item>();

    public Drink(String name) {
        super(name);
    }

    public void addIngredientItem(Item item) {
        ingredientItems.add(new Item(item.product, item.count));
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", ingredientItems=" + Arrays.toString(ingredientItems.toArray()) +
                '}';
    }
}
