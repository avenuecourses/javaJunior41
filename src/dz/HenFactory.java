package dz;

public abstract class HenFactory {

    public static Hen getHеn(String country){
        String countryLowerCase = country.toLowerCase();

        if ("россия".equals(countryLowerCase)){
            return new  RussianHen();
        }else if ("украина".equals(countryLowerCase)){
            return new UkrainianHen();
        }else if ("Молдовский".equals(countryLowerCase)){
            return new MoldovanHen();
        }else if ("Беларусь".equals(countryLowerCase)){
            return new BelarusianHen();
        }else {
            return new RussianHen();
        }
    }
    }