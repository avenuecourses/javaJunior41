package lesson5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /** Программа будет просить пользователя ввести с консоли фигуру
         *  (треугольник, квадрат, овал, круг, трапеция)
         *  Потом мы пользователя просим ввести нужные данные о фигуре ( сторона, высота и т,д)
         *  И на основании введенных данных печатаем на консоль площадь и перимерт
         */

        System.out.println("Выберите фигуру:");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - овал");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");

        // считываение с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.next(); // число или слово

        if(inputFigura.equals("1") || inputFigura.equalsIgnoreCase("треугольник")){ // если выбрали треугольник
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            System.out.println("Площадь треугольника:");
            MathUtils.squareTriangle(a, b, c);
            System.out.println("Перимерт треугольника: " + MathUtils.perimetrTriangle(a, b, c));
        }

    }
}
