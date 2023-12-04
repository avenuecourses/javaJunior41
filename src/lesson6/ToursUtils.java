package lesson6;

public class ToursUtils {

    // создадим метод, который будет сохранять 1 тур в двухмерный массив
    public static void addTour(String country, String city, String transport, String day, String cost, String stars, String food, String[][] tours){
        for(int i = 0; i < tours.length; i++){
            if(tours[i][0] == null){
                tours[i][0] = (i + 1) + "";
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transport;
                tours[i][4] = day;
                tours[i][5] = cost;
                tours[i][6] = stars;
                tours[i][7] = food;
                break;
            }
        }
    }

    public static void printToursByCountry(String[][] tours, String country){
        for(int i = 0; i < tours.length; i++){
            if(tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)){
                System.out.printf("Тур №%s в %s (%s), на %s, %s, %s, %s за %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                        tours[i][6], tours[i][7], tours[i][5]);
            }
        }
    }

    public static void printToursByBudget(String[][] tours, int budget){
        for(int i = 0; i < tours.length; i++){ // проход по каждому туру
            // "120000 руб" -- 5 колонка
            // int budget = 120000;
            if(tours[i][0] != null){
                int spaceIndex = tours[i][5].indexOf(" "); // узнали позицию пробела
                String priceStr = tours[i][5].substring(0, spaceIndex); // вырезали только цену (без руб)
                int priceCurrentTour = Integer.parseInt(priceStr); // преобразовали текстовую цену в число

                int maxBudget = budget + 20000;
                int minBudget = budget - 20000;
                if(priceCurrentTour >= minBudget && priceCurrentTour <= maxBudget){ // если мы входим в бюджет
                    System.out.printf("Тур №%s в %s (%s), на %s, %s, %s, %s за %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][4], tours[i][3],
                            tours[i][6], tours[i][7], tours[i][5]);
                }
            }
        }
    }


}
