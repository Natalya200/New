public class FoodBowl {
    private int foodAmount; // Количество еды в миске

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    // Метод для добавления еды
    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды");
    }

    // Метод для взятия еды
    public boolean takeFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }

    // Геттер для количества еды
    public int getFoodAmount() {
        return foodAmount;
    }
}
