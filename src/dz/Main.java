package dz;

public class Main{
    public static void main(String[] args) {
        Hen hen = HenFactory.getHеn("Беларусь!!!"); // проявление пораждающего шаблона Factory
        hen.getCountOfEggsPerMonth();
        System.out.print(hen.getDescription());
        System.out.println();
    }
}