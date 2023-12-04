package lesson2;

public class Main1 {
    public static void main(String[] args) {
        // Задача: есть число, нужно напечатать на консоль true - если четное, false - если нечетное

        int number = 136; // 125  234  444  555
        int ostatokDeleniyaNa2 = number % 2; // 1   0
        System.out.println(ostatokDeleniyaNa2 == 0);

    }
}
