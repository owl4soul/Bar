package bar.cooking;

import bar.cooking.item.Item;
import bar.cooking.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Item> items = new ArrayList<Item>();

    public Store add(Item item) {
        Item has = findResource(item.product);
        if (has == null) {
            items.add(item);
        } else {
            has.count += item.count;
        }
        return this;
    }

    private Item findResource(Product product) {
        for (Item has : items) {
            if (has.product == product) return has;
        }
        return null;
    }

    public boolean hasResources(Product product, int count) {
        Item item = findResource(product);
        if (item == null) return false;
        return item.count >= count;
    }

    public boolean removeResource(Product product, int count) {
        Item item = findResource(product);
        if (item == null) return false;
        if (item.count < count) return false;
        item.count -= count;
        if (item.count <= 0) items.remove(item);
        return true;
    }

    public int count(Item item) {
        Item productItem = findResource(item.product);
        return productItem == null ? 0 : productItem.count;
    }

    @Override
    public String toString() {
        return "Store{" +
                "items=" + Arrays.toString(items.toArray()) +
                '}';
    }
}
