import java.util.Arrays;

public class ArraysAndLoops {

    static int[] array1 = {0, 1, 1, 0, 1};
    static int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
    };
    static int len = 7;
    static int initialValue = 5;

    static int[] array3 = {1000, 5, 600, -2, 11, 4, 300, 2, 1000, 0, 9, 300};
    static int[] array4 = {2, 2, 2, 1, 2, 2, 10, 1};

    static void swap0And1InAnArrayAndPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    static void initializeFillArrayValuesFrom1To100AndPrint() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    static int[] valuesLessThan6MultiplyBy2InAnArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    static void fillTheMainDiagonalWithOnesAndPrint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        printATwoDimensionalArray(matrix);
    }

    static void fillTheMainAndAdditionalDiagonalsWithOnesAndPrint(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        printATwoDimensionalArray(matrix);
    }

    static int[] initialiseAndFillArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    static void findAndPrintMaxAndMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }

    static boolean balanceInArray(int[] array) {
        int sumOfAllNumbers = sumOfNumbers(array);
        if (sumOfAllNumbers % 2 == 0) {
            int halfOfSumOfAllNumbers = sumOfAllNumbers / 2;
            int sumOfTheFirstNumbers = 0;
            int i = 0;

            while (sumOfTheFirstNumbers < halfOfSumOfAllNumbers) {
                sumOfTheFirstNumbers += array[i];
                i++;
            }

            return sumOfTheFirstNumbers == halfOfSumOfAllNumbers;
        }
        return false;
    }

    static void printATwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Row # " + i + "| ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[j].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    static int sumOfNumbers (int[] array) {
        int sumOfNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfNumbers += array[i];
        }
        return sumOfNumbers;
    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        swap0And1InAnArrayAndPrint(array1);
        System.out.println("Задание 2");
        initializeFillArrayValuesFrom1To100AndPrint();
        System.out.println("Задание 3");
        System.out.println(Arrays.toString(valuesLessThan6MultiplyBy2InAnArray(array2)));
        System.out.println("Задание 4.1");
        fillTheMainDiagonalWithOnesAndPrint(matrix);
        System.out.println("Задание 4.2");
        fillTheMainAndAdditionalDiagonalsWithOnesAndPrint(matrix);
        System.out.println("Задание 5");
        System.out.println(Arrays.toString(initialiseAndFillArray(len, initialValue)));
        System.out.println("Задание 6");
        findAndPrintMaxAndMin(array3);
        System.out.println("Задание 7");
        System.out.println(balanceInArray(array4));

    }
}
