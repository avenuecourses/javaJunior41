package dz;

public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 30;
    }

    public MoldovanHen() {
    }

    @Override
    public String toString() {
        return "MoldovianHen{}";
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Молдовиа. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
