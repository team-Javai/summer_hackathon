package blackjack.player;

import blackjack.card.Deck;

public class Dealer extends AbstractPlayer{
    public Dealer (String name){
        super(name);
    }
    public void initCardList(Deck deck) {
        draw(deck);
        draw(deck, true);
    }

@Override
    public void drawCard(Deck deck) {
        System.out.println(getName() + "の得点は" + calcScore() + "点です \n");
        while(calcScore() < 16) {
            draw(deck);
            System.out.println(getName() + "の得点は" + calcScore() + "点です \n");
        }

    }
}
