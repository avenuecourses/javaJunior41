package lesson4;

public class Main3 {
    public static void main(String[] args) {
        char[][] matrix = new char[8][8];


        // Заполнение пустой части массива и освобождение заполненной части
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i) {
                    matrix[i][j] = '1';
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        // Вывод массива
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
