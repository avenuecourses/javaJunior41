package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {
    private int[][] fieldWithMins; // оставляем данное поле пустым, так как мы НЕ ЗНАЕМ сколько будет строк и колонок
    private int countMins = 0; // оставляем данное поле пустым, так как мы НЕ ЗНАЕМ сколько будет мин
    private boolean[][] fieldToOpen;
    private int countClosedCellsToWin = 0;

    public SaperField(String level){
        if(level.equals("1") || level.equalsIgnoreCase("новичок")){
            fieldWithMins = new int[9 + 2][9 + 2];
            fieldToOpen = new boolean[9 + 2][9 + 2];
            countMins = 10;
            countClosedCellsToWin = countMins + ((9 + 9) * 2) + 4;
        }

        if(level.equals("2") || level.equalsIgnoreCase("Любитель")){
            fieldWithMins = new int[16 + 2][16 + 2];
            fieldToOpen = new boolean[16 + 2][16 + 2];
            countMins = 40;
            countClosedCellsToWin = countMins + ((16 + 16) * 2) + 4;
        }

        if(level.equals("3") || level.equalsIgnoreCase("Профессионал")){
            fieldWithMins = new int[16 + 2][32 + 2];
            fieldToOpen = new boolean[16 + 2][32 + 2];
            countMins = 99;
            countClosedCellsToWin = countMins + ((16 + 32) * 2) + 4;
        }

        if(level.equals("4") || level.equalsIgnoreCase("Особый")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите кол-во строк:");
            int row = scanner.nextInt();

            System.out.println("Введите кол-во колонок:");
            int col = scanner.nextInt();

            System.out.println("Введите кол-во мин:");
            countMins = scanner.nextInt();

            fieldWithMins = new int[row + 2][col + 2];
            fieldToOpen = new boolean[row + 2][col + 2];
            countClosedCellsToWin = countMins + ((row + col) * 2) + 4;
        }
    }

    public void addRandomMins(){
        for(int i = 0; i < countMins; i++){
            int row = ThreadLocalRandom.current().nextInt(1, fieldWithMins.length - 1);
            int col = ThreadLocalRandom.current().nextInt(1, fieldWithMins[0].length - 1);
            if(fieldWithMins[row][col] != -1){
                fieldWithMins[row][col] = -1;
            }else {
                i--;
            }

        }
    }

    public void countAndAddNums(){
        for(int i = 0; i < fieldWithMins.length; i++){
            for(int j = 0; j < fieldWithMins[0].length; j++){
                // заполняем всех соседей +1 к числу, если в клеточке мина
                if(fieldWithMins[i][j] == -1){
                    if(fieldWithMins[i - 1][j - 1] != -1){
                        fieldWithMins[i - 1][j - 1] = fieldWithMins[i - 1][j - 1] + 1;
                    }
                    if(fieldWithMins[i - 1][j] != -1){
                        fieldWithMins[i - 1][j] = fieldWithMins[i - 1][j] + 1;
                    }
                    if(fieldWithMins[i - 1][j + 1] != -1){
                        fieldWithMins[i - 1][j + 1] = fieldWithMins[i - 1][j + 1] + 1;
                    }
                    if(fieldWithMins[i + 1][j + 1] != -1){
                        fieldWithMins[i + 1][j + 1] = fieldWithMins[i + 1][j + 1] + 1;
                    }
                    if(fieldWithMins[i][j - 1] != -1){
                        fieldWithMins[i][j - 1] = fieldWithMins[i][j - 1] + 1;
                    }
                    if(fieldWithMins[i + 1][j] != -1){
                        fieldWithMins[i + 1][j] = fieldWithMins[i + 1][j] + 1;
                    }
                    if(fieldWithMins[i][j + 1] != -1){
                        fieldWithMins[i][j + 1] = fieldWithMins[i][j + 1] + 1;
                    }

                }
            }
        }
    }

    public void printField(){
        System.out.println("------ Ваше поле: ------");
        for(int i = 1; i < fieldWithMins.length - 1; i++){ // обходим первую и последнюю строку
            for(int j = 1; j < fieldWithMins[0].length - 1; j++){ // обходим первую и последнюю колонку
                if(fieldToOpen[i][j] == true){ // если клеточка открыта
                    System.out.print(fieldWithMins[i][j] + " ");
                }else { // если клеточка ЗАКРЫТА
                    System.out.print("Х ");
                }
            }
            System.out.println();
        }
    }

    public void printFieldEndGame(){
        System.out.println("------ Ваше поле: ------");
        for(int i = 1; i < fieldWithMins.length - 1; i++){ // обходим первую и последнюю строку
            for(int j = 1; j < fieldWithMins[0].length - 1; j++){ // обходим первую и последнюю колонку
                if(fieldToOpen[i][j] == true || fieldWithMins[i][j] == -1){ // если клеточка открыта или там мина
                    System.out.print(fieldWithMins[i][j] + " ");
                }else { // если клеточка ЗАКРЫТА
                    System.out.print("Х ");
                }
            }
            System.out.println();
        }
    }


    public boolean doStep(){

        if(countClosedCellsToWin == this.countClosedCells()){
            System.out.println(" ---- ВЫ ВЫИГРАЛИ!!! --- ");
            this.printFieldEndGame();
            return false;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите строку:");
        int row = scanner.nextInt();

        System.out.println("Выберите колонку:");
        int col = scanner.nextInt();

        if(row <= 0 || row > fieldWithMins.length - 1 || col <= 0 || col > fieldWithMins[0].length - 1){ // если индексы не корректны
            System.out.println("Повторите ввод!!! Неверные индексы");
            this.doStep(); // рекурсивный вызов метода
        }

        if(fieldToOpen[row][col] == true){ // проверка задублированного хода
            System.out.println("Вы УЖЕ ранее открыли эту ячейку, повторите ввод!!!");
            this.doStep(); // рекурсивный вызов метода
        }

        // 100% знаем что индексы нам точно подходят

        if(fieldWithMins[row][col] == -1){ // экспресс проверка на окончание игры (если Игрок наступил на мину)
            System.out.println("Вы проиграли!!!");
            this.printFieldEndGame();
            return false; // даем ответ что еще один шаг НЕ НУЖЕН
        }else { // если в ячейке не мина, и нужно продолжить игру дальше
            fieldToOpen[row][col] = true;
            return true; // даем ответ что ШАГ СЛЕДУЮЩИЙ НУЖЕН
        }
    }

    private int countClosedCells(){
        int count = 0;
        for(int i = 0; i < fieldToOpen.length; i++){
            for(int j = 0; j < fieldToOpen.length; j++){
                if(fieldToOpen[i][j] == false){
                    count++;
                }
            }
        }
        return count;
    }
}
