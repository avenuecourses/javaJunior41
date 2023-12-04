package lesson3;

public class Main4 {
    public static void main(String[] args) {
        // Есть массив чисел, напечатать на консоль
        // соседа справа, если ячейка красная трем

        int[] numbers = {45, 45, 3, 2, 7, 4, 3, 8, 5, 8};

        for(int i = 0; i < numbers.length; i++){
            if(i != numbers.length - 1){ // когда есть сосед справа
                if(numbers[i] % 3 == 0){ // проверка на кратность 3м
                    System.out.println(numbers[i + 1]);
                }
            }
        }
    }
}
