package dz;

public class BelarusianHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 30;
    }

    public BelarusianHen() {
    }

    @Override
    public String toString() {
        return "BelarusianHen{}";
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - Беларусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
