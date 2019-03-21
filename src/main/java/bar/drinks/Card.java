package bar.drinks;

import java.util.HashMap;
import java.util.Map;

public class Card {
    public static HashMap<String, Drink> card = new HashMap<String, Drink>(){{
        card.put(Americano.name, new Americano());
        card.put(Cappuccino.name, new Cappuccino());
        card.put(Espresso.name, new Espresso());
    }};

}
