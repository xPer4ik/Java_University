package Task_2.Task_2_9;

import java.util.*;


public class Poker {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        // массив с колодой карт для покера
        List<String> deckOfCards = new ArrayList<>(Arrays.asList(
                "2S", "3S", "4S", "5S", "6S", "7S",
                "8S","9S","TS","JS","QS","KS","AS",
                "2H", "3H", "4H", "5H", "6H", "7H",
                "8H","9H","TH","JH","QH","KH","AH",
                "2D", "3D", "4D", "5D", "6D", "7D",
                "8D","9D","TD","JD","QD","KD","AD",
                "2C", "3C", "4C", "5C", "6C", "7C",
                "8C","9C","TC","JC","QC","KC","AC"
        ));
        // перемешивание колоды
        Collections.shuffle(deckOfCards);
        System.out.println(deckOfCards);
        System.out.println("Введите количество человек:");
        int people = scanner.nextInt();
        // информирование о недопустимом количестве человек
        if(people > 10){
            System.out.println("Количество человек превышает допустимое");
        }
        else{
            // раздача карт участникам игры по 5 карт
            for (int i = 1; i < people*5+1;i++){
                System.out.print(deckOfCards.get(0)+" ");
                deckOfCards.remove(0);
                if(i%5==0){
                    System.out.println("\n");
                }
            }
        }



    }
}
