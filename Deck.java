package blackjack.card;

import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Collections;

public class Deck {

    private List<Card> bill;
    {
        bill = Arrays.stream(Suit.values().toArray()).flatMap(s -> IntStream.rangeClosed(1,13).mapToObj(i -> new Card((Suit) s,i))).collect(Collectors.toList());
    }

    public Card draw(){
        Collections.shuffle(bill);
        Card card =bill.get(0);
        bill.remove(0);
    return card;
    }

}
