package lesson7.blackJack;

import java.util.ArrayList;

public class BlackJack {
    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    public BlackJack() {
        koloda.prepare();
    }

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(){
        for(Player player: players){ // прошлись по всем играм и крупье
            player.addCartToHand(koloda.randomCard()); // дали первую карту на сохранение
            player.addCartToHand(koloda.randomCard());// дали вторую карту на сохранение
        }
    }

    public void dealRestCardsToAllPlayers(){
        for(Player player: players){// прошлись по всем играм и крупье
            while (player.doYouNeedMoreCards()){ // проявление полиморфизма
                player.addCartToHand(koloda.randomCard()); // дали карту на сохранение
            }
        }
    }

    public void printWinner(){
        /**  13     13     22      12      10      ------ выиграли 13 13
         *   24     26     22      22      23      ------ выиграли Крупье
         *   24     26     21      21      21      ------ выиграли 21 21 21
         *   20     20     20      20      20      ------ выиграли все
         *   17     19     20      24      18      ------ выиграл  20
         */

        // ставим Флажок FALSE всем у кого перебор
        for(Player player: players){
            if(player.countValueInHand() > 21){
                player.setCanWin(false);
            }
        }

        if(countPlayersWhoCanWin() == 0){ // если у всех перебор - находим крупье и печатаем его карты
            for(Player player: players){
                if(player instanceof Dealer){
                    System.out.println("Выиграл: " + player.getName());
                    player.openHand();
                    return; // выходим из метода, дальше проверки не нужны, мы уже нашли победителя
                }
            }
        }

        /**  13     13     22      12      10      ------ выиграли 13 13
         *   24     26     21      21      21      ------ выиграли 21 21 21
         *   20     20     20      20      20      ------ выиграли все
         *   17     19     20      24      18      ------ выиграл  20
         */

        int winnerValue = 1; // 20
        for(Player player: players){ // ищем максимальный балл к 21, и игрок должен быть еще в игре
            if(player.isCanWin() && player.countValueInHand() > winnerValue){
                winnerValue = player.countValueInHand();
            }
        }


        for(Player player: players){
            if(player.countValueInHand() == winnerValue){ // если у игрока балл победителя
                System.out.println("Выиграл: " + player.getName());
                player.openHand();
            }
        }

    }

    public int countPlayersWhoCanWin(){
        int count = 0;
        for(Player player: players){
            if(player.isCanWin()){
                count++;
            }
        }
        return count;
    }


}
