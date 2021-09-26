package lesson9;

public class Main {

    public static final int SIZE = 4;

    public static void main(String[] args) {

        String[][] arr1 = {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "5", "6"},
                {"5", "6", "7", "6"},
                {"3", "4", "5", "6"}
        };

        String[][] arr2 = {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "5"},
                {"5", "6", "7", "6"},
                {"3", "4", "5", "6"},
                {"3", "4", "5", "6"}
        };

        String[][] arr3 = {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "5"},
                {"5", "6", "7", "6"},
                {"3", "srg", "5", "6"}
        };

        String[][] arr4 = {
                {"1", "2", "3", "4"},
                {"2", "3", "4", "5"},
                {"5", "6", "7", "6"},
                {"3", "1", "5", "6"}
        };

        try {
            System.out.println("sum arr1 = " + sum(arr1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("sum arr2 = " + sum(arr2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("sum arr3 = " + sum(arr3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("sum arr4 = " + sum(arr4));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sum(String[][] arr) {
        if (arr.length != SIZE) throw new MyArraySizeException("Invalid array size. Should be 4x4.");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) throw new MyArraySizeException("Invalid array size. Should be 4x4.");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Invalid data in the cell [%d][%d]. Should be a number.", i + 1, j + 1));
                }
            }
        }
        return sum;
    }

}
