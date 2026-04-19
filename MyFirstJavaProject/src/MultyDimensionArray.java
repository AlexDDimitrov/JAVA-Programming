public class MultyDimensionArray {
    public static void main(String[] args) {
        String[] fruits = {"apples", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};
        String[][] groceries = {fruits, vegetables, meats};

        for(String[] foods: groceries) {
            for(String food: foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
