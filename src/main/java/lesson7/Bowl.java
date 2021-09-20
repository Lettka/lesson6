package lesson7;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
        if (foodAmount < 0) this.foodAmount = 0;
    }

    public boolean decreaseFood(int amount) {
        if (this.foodAmount - amount < 0) {
            System.out.printf("Not enough food in the bowl! Remain %d food in the bowl.\n", this.foodAmount);
            return false;
        } else {
            this.foodAmount -= amount;
            System.out.printf("Bowl decreased by %d food, now remain: %d\n", amount, this.foodAmount);
            return true;
        }
    }

    public void addFoodToBowl(int amount) {
        this.foodAmount += amount;
        System.out.printf("Add %d food into bowl. Now %d food in the bowl.\n\n", amount, this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
