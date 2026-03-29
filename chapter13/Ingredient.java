public class Ingredient {
    private String name, explanation;
    private int amount;
    Ingredient(String inputName, int inputAmount, String inputExplanation) {
        this.name = inputName;
        this.amount = inputAmount;
        this.explanation = inputExplanation;
    }

    @Override
    public String toString() {
        return this.name + " " + this.amount + " " + this.explanation;
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }
}