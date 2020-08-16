package blackjack.player;

import java.util.ArrayList;
import java.util.List;

import blackjack.card.Card;
import blackjack.card.Deck;

public abstract class AbstractPlayer {
    protected static final int burstPoint = 21;


    private final String name;
    private final List<Card> cardList = new ArrayList<>();

    private boolean isBurst = false;

    public AbstractPlayer(String name) {
        this.name = name;
    }

    private void addCardList(Card card){
        cardList.add(card);
    }

    public int calcScore(){
        int score = cardList.stream().filter(card -> card.getPoint() > 1 ).mapToInt(card -> card.getPoint()).sum();
        int aceCardCount = (int) cardList.stream().filter(card -> card.getPoint() == 1 ).count();
        if (aceCardCount == 0) return score;
        int borderScore = 11 - aceCardCount;
        return score > borderScore ? score + aceCardCount : score + 10 + aceCardCount ;
    }

    public void draw(Deck deck){
        draw(deck, false);
    }


    public void draw(Deck deck, boolean isHidden) {
        Card card = deck.draw();
        addCardList(card);
        if(calcScore() > burstPoint) setIsBurst(true);
        String msg = isHidden
                ? this.name + "の引いたカードは" + card.toString() + "です。"
                : this.name + "の引いたカードは" + card.toString() + "です。";
        System.out.println(msg);
    }


    public abstract void initCardList(Deck desk);
    public abstract void drawCard(Deck deck);

    public boolean getIsBurst() {
    return isBurst;
}
    public void setIsBurst(boolean tf){
        this.isBurst = tf;
    }

    public String getName(){
        return name;
    }

    

}
