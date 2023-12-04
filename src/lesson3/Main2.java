package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // Есть массив чисел, нужно напечатать на консоль только четные числа в обратном порядке

        int[] numbers = {3, 5, 7, 8, 5, 3, 2, 4, 6, 7, 9, 6, 4};

        for(int i = numbers.length - 1; i >= 0; i--){
            if(numbers[i] % 2 == 0){ // проверка на четность числа в массиве
                System.out.println(numbers[i]);
            }
        }
    }
}
