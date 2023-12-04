package lesson7;

public class TourAgency {
    public Tour[] tours;
    public int numberOfTours;


    public TourAgency(int maxTours) {
        tours = new Tour[maxTours];
        numberOfTours = 0;
    }

    public void addTour(Tour tour){
        if (numberOfTours < tours.length){
            tours[numberOfTours] = tour;
            numberOfTours++;
        } else {
            System.out.println("Невозможно добавить еще тур");
        }
    }

    public void displayTours(){
        System.out.println("все туры");
        for (int i = 0; i < numberOfTours; i++){
            tours[i].displayTourInfo();
            System.out.println("   ");
        }
    }

    public void showCheapestTour(){
        if (numberOfTours > 0){
            Tour cheapestTour = tours[0];
            for (int i = 1; i < numberOfTours; i ++){
                if (tours[i].getPrice() < cheapestTour.getPrice()){
                    cheapestTour = tours[i];
                }
            }
            System.out.println("самый дешовый тур");
            cheapestTour.displayTourInfo();
        }else {
            System.out.println("    ");
        }
    }


}
