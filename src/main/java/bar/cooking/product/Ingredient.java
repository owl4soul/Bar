package bar.cooking.product;

public class Ingredient extends Product {
    public static final Ingredient shot = new Ingredient("SHOT").cost(40);
    public static final Ingredient milk = new Ingredient("MILK").cost(50);
    public static final Ingredient sugar = new Ingredient("SUGAR").cost(5);
    public static final Ingredient water = new Ingredient("WATER");
    public static final Ingredient ice = new Ingredient("ICE");

    public int cost = 0;

    public Ingredient(String name) {
        super(name);
    }

    public Ingredient cost(int cost) {
        this.cost = cost;
        return this;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                '}';
    }
}
