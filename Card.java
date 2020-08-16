package blackjack.card;

public class Card {

    private Suit suit;
    private int rank;

    public Card(Suit suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }


    private String toStringDisplayValue(){
        switch(this.rank){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(this.rank);
        }
    }
    public int getPoint() {
        return this.rank > 10 ? 10 : this.rank;
    }

    @Override
    public String toString(){
        return this.toStringDisplayValue();
    }
}
