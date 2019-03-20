package bar.cooking.item;

import bar.cooking.product.Product;

public class Item {
    public final Product product;
    public int count = 1;

    public Item(Product product) {
        this.product = product;
    }

    public Item(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product.name +
                ", count=" + count +
                '}';
    }
}
