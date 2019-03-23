package bar.drinks;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    public HashMap<String, String> getMapOfSubs(String[] input) {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < input.length - 1; i = i + 2) {
            map.put(input[i], input[i + 1]);
        }
        return map;

    }

    public String[] getSubstrings(String input) {
        String[] substrings = input.split(" ");
        return substrings;
    }
}
