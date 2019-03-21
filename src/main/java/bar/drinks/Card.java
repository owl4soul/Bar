package bar.drinks;

import java.util.HashMap;
import java.util.Map;

public class Card {
    public static HashMap<Integer, Drink> card = new HashMap<Integer, Drink>();
    static {{
        card.put(Americano.id, new Americano());
        card.put(Cappuccino.id, new Cappuccino());
        card.put(Espresso.id, new Espresso());
    }}

}
