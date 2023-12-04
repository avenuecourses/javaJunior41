package lesson4;

public class HW123 {
    public static void main(String[] args) {
        int[] massive = {3,5,8,3,55,54,1,65,36,98};

        for(int i = 0; i < massive.length; i = i + 2){
            System.out.println(massive[i]);
        }

        for(int i = massive.length - 1; i >= 0; i--){
            System.out.println(massive[i]);
        }
        System.out.println("-----------------------");

        for(int i = 0; i < massive.length; i++){
            // Нужно преобразовать число в ряд символов
            // конкатенация строк = склеивание текста (объединение)
            String currentNumFromMassive = massive[i] + ""; // 3 --> "3"
            if(currentNumFromMassive.contains("5")){
                System.out.println(currentNumFromMassive);
            }
        }

    }
}
