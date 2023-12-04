package lesson7;

public class Main {
    public static void main(String[] args) {
        // формула создания объекта определенного типа
                      // вызов конструктора (особый метод который вызывается после слова new)
        Student vasya = new Student(27, "Вася", "Грозный", "98457485");
        Student petya = new Student();
        vasya.setAge(28);
        petya.setAge(23);

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
    }
}
