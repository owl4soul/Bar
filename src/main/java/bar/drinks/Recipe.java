package bar.drinks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Recipe {
    Map<String, String> matrix;


    public static class BuilderCustom {
        private Recipe recipe;

        public BuilderCustom() {
            this.recipe = new Recipe();
        }



        public BuilderCustom withAnything(Map<String, String> matrix) {
            this.recipe.matrix = new HashMap<String, String>(matrix);
            return this;
        }

        public Recipe build() {
            return this.recipe;
        }

    }
}

