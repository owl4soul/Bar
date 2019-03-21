package bar.drinks;

import java.util.HashMap;
import java.util.Map;

public interface Menu {
    Map<String, Drink> menu = new HashMap<String, Drink>();


    void addDrinkToMenu();

    void removeDrinkFromMenu();
}
