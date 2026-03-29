import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class listExercise {
    public static void main(String[] args) {
        List<String> recipe = new ArrayList<>();
        recipe.add("salt");
        List<String> recipe2 = new ArrayList<>(Arrays.asList("sugar", "honey"));
        recipe.add(0, "yeast");
        recipe.remove("salt");
        recipe2.set(recipe2.indexOf("sugar"), "water");
        for (int i = 0; i < recipe.size(); i++) {
            System.out.println(recipe.get(i));
        }
        // Ascending order
        recipe.sort(null);
        // Descending order
        recipe.sort((a, b) -> (b.compareTo(a)));

        List<Integer> numbers = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("salt", 10, "gram"));
        ingredients.add(new Ingredient("sugar", 10, "kilo gram"));
        ingredients.sort(Comparator.comparing(x -> x.getName()));
        ingredients.sort((a, b) -> {
                if (a.getName().length() == b.getName().length()) {
                    return Integer.compare(a.getAmount(), b.getAmount());
                } else {
                    return Integer.compare(a.getName().length(), b.getName().length());
                }
        });
    }
}