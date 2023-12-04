package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tours = new String[100][8];
        ToursUtils.addTour("Италия", "Рим", "Самолет",
                "6 дней", "140000 руб", "5 звезд", "Завтрак", tours);

        ToursUtils.addTour("Италия", "Флоренция", "Самолет",
                "5 дней", "180000 руб", "4 звезды", "Все включено", tours);

        ToursUtils.addTour("Франция", "Париж", "Самолет",
                "6 дней", "140000 руб", "4 звезды", "Все включено", tours);

        ToursUtils.addTour("Ливан", "Бейрут", "Автобус",
                "6 дней", "50000 руб", "4 звезды", "Завтрак + Ужин", tours);

        ToursUtils.addTour("Франция", "Париж", "Самолет",
                "6 дней", "120000 руб", "3 звезды", "Завтрак", tours);

        ToursUtils.addTour("Германия", "Мюнхен", "Автобус",
                "6 дней", "210000 руб", "4 звезды", "Завтрак + Ужин", tours);

        ToursUtils.addTour("Германия", "Берлин", "Самолет",
                "6 дней", "180000 руб", "5 звезд", "Все включено", tours);

        ScannerUtils.searchByCountry(tours);
        ScannerUtils.searchByBudget(tours);
        /** 1 - Вывести на консоль туры, которые на ... дней
         *  2 - Вывести на консоль туры, на ... звезд и ... транспортом
         *  3 - Вывести на консоль туры, ... страны и на ... бюджет
         */

    }
}
