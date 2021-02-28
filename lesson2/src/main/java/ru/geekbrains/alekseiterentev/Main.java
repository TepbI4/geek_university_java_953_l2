package ru.geekbrains.alekseiterentev;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"},
                            {"5", "A", "7", "8"},
                            {"9", "8", "7", "6"},
                            {"5", "4", "3", "2"}};

        try {
            System.out.println(sum(arr));
        } catch (MyArraySizeException e) {
            System.out.println("Unacceptable array dimension. 4x4 should be used");
        } catch (MyArrayDataException e) {
            System.out.println("Unacceptable data in array. Check symbol in " + e.getI() + " " + e.getJ() + " position");
        }
    }

    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(e, i, j);
                }
            }
        }

        return sum;
    }
}
