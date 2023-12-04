package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры:");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine(); // текст "1" или "Новичок"

        SaperField saperField = new SaperField(level); // ожидание - в конструкторе создастся массив
        // размером по заданному уровню
        saperField.addRandomMins();
        saperField.countAndAddNums();
        saperField.printField();

        while (saperField.doStep()){ // или будет следующий шаг, или выход из игры
            saperField.printField(); // печатаем текущее поле, и заново спрашиваем шаг
        }
    }
}

