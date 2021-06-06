package laba1;

public class Koloda {
    String[] cards = new String[52];
    public void NewKoloda(){
        int k=0;
        for (int i=0;i<4;i++){
            for (int j=0; j<13;j++){
                cards[k++]=new PlayingCard(PlayingCard.SUITS_LIST[i],PlayingCard.RANK_LIST[j]).toString();//создаем покерную колоду из 52 карт
            }
        }
    }


    public void Tusim(){
        String firstTusovka;
        String secondTusovka;
        for (int i=0; i<1000;i++){//обходим алгоритм некое количество раз в нашем случае 1000 чтобы лучше перемешать
            int n1=((int) (Math.random()*52));//определяем карту от 1 до 52
            int n2=((int) (Math.random()*52));
            firstTusovka=cards[n1];
            secondTusovka=cards[n2];
            cards[n1]=secondTusovka;
            cards[n2]=firstTusovka;//производим тусовку
        }
    }


    public void Razdacha(int players){//указываем количество участников
        int t=0;
        for (int i=1;i<=players;i++){
            System.out.println("У игрока "+i+"-го колода:");
            for (int j=0; j<5;j++){//каждому игроку раздаем по 5 карт
                System.out.println(cards[t++]);
            }System.out.println("\n");
        }
    }

}
