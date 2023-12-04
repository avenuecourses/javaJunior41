package lesson2;

public class Main2 {
    //С помощью цикла For, напечатать на консоль:
    //Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
    public static void main(String[] args) {
        for (int i = 20; i <= 60; i++) {
            if (i >= 30 && i <= 40) {
                continue;
            }
            System.out.println(i);
        }
    }
}
