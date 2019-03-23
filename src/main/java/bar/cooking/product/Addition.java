package bar.cooking.product;

public class Addition extends Ingredient {
    public static final Ingredient sugar = new Addition("SUGAR").cost(1);
    public static final Ingredient ice = new Addition("ICE").cost(1);
    public static final Ingredient cinnamon = new Addition("CINNAMON").cost(1);

    public static boolean canBeAdded(Drink drink, Addition ingredient) {
        if (drink.name.equalsIgnoreCase("Espresso")
                & ingredient.name.equalsIgnoreCase("ice")) {
            System.out.println("Don't think it would be a good combination...");
            return false;
        } else {
            return true;
        }
    }

    public Addition(String name) {
        super(name);
    }
}
