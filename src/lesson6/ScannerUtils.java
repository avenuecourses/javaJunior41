package lesson6;

import java.util.Scanner;

public class ScannerUtils {

    public static void searchByCountry(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать?");
        String country = scanner.next();
        System.out.println("----- РЕЗУЛЬТАТ------");
        ToursUtils.printToursByCountry(tours, country);
        System.out.println("---------------------");
    }

    // поиск туров по бюджету. Пользователь задает одно число, и мы печататем туры +- 20т от этого бюджета

    public static void searchByBudget(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какой бюджет распологаете?");
        int budget = scanner.nextInt();
        System.out.println("----- РЕЗУЛЬТАТ------");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println("---------------------");
    }

}
