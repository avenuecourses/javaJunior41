package lesson1;

import lesson7.Tour;
import lesson7.TourAgency;

public class Main {
    public static void main(String[] args) {

        Tour myTour = new Tour("Испания", 10, "самолет", 1200) {};
        Tour myTour1 = new Tour("Италия", 13, "автобус", 1500) {};
        Tour myTour2 = new Tour("Германия", 15, "самолет", 1600) {};
        Tour myTour3 = new Tour("Франсия", 19, "автобус", 1800) {};
        myTour.displayTourInfo();
        myTour1.displayTourInfo();
        myTour2.displayTourInfo();
        myTour3.displayTourInfo();

        TourAgency myTourAgency = new TourAgency(4);

        myTourAgency.addTour(myTour);

        myTourAgency.displayTours();

        myTourAgency.showCheapestTour();
     }



}



