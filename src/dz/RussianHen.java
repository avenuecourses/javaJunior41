package dz;

public class RussianHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 30;
    }

    public RussianHen() {
    }

    @Override
    public String toString() {
        return "RussianHen{}";
    }

   @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Россия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
   }
}
