package blackjack.player;

import blackjack.card.Deck;

import java.util.Objects;
import java.util.Scanner;

public class Player extends AbstractPlayer{

    public Player(String name){
        super(name);
    }

    public void initCardList(Deck deck){
        draw(deck);
        draw(deck);
    }

    @Override
public void drawCard(Deck deck) {
        System.out.println(getName() + "の得点は" + calcScore() + "点です \n");
        try(Scanner sc = new Scanner(System.in)) {
            String line = null;
            while (!getIsBurst() && !Objects.equals(line, "N")) {
                System.out.println("カードを引きますか？引く場合はYを、引かない場合はNを入力してください。\n");
                line = sc.nextLine();
                if(Objects.equals(line, "Y")){
                    draw(deck);
                    System.out.println(getName() + "の得点は" + calcScore() + "点です \n");
                } if(!Objects.equals(line, "N")) {
                    System.out.println("Y/N以外が入力されました。");
                }

            }
        }





}

}
