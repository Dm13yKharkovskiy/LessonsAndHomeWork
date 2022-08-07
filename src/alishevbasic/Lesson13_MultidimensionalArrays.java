package alishevbasic;

public class Lesson13_MultidimensionalArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[][] numbers1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Первый массив");
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers1.length; j++) {
                System.out.print(numbers1[i][j] + " ");
            }
            System.out.println();
        }
        int[][] numbers2 = new int[3][3];
        System.out.println("Второй массив");
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                numbers2[i][j] = i + j;
                System.out.print(numbers2[i][j] + " ");
            }
            System.out.println();
        }

    }

}

