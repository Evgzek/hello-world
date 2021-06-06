package laba1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько игроков в игре от 1 до 6:");
        int n = input.nextInt();
        while (n<1 || n>6){
            System.out.println("Я же указал вам диапозон игроков, повторите ввод пожалуйста:");
            n=input.nextInt();
        }
        System.out.println("В игру играет "+n+" игроков.");
        Koloda myCards = new Koloda();
        myCards.NewKoloda();
        myCards.Tusim();
        myCards.Razdacha(n);
        input.close();
    }
}
