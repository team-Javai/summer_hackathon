package blackjack.card;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


public class Suit implements Comparable<Suit>{
    public static final Suit SPADE = new Suit("SPADE", "♠");
    public static final Suit HEART = new Suit("HEART", "♡");
    public static final Suit DIAMOND = new Suit("DIAMOND", "♢");
    public static final Suit CLUB = new Suit("CLUB", "♣");

    private static final List<Suit> VALUES =
            Collections.unmodifiableList(
                    Arrays.asList(SPADE, HEART, DIAMOND, CLUB)
            );
    private final String name;
    private final String symbol;

    private Suit(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    @Override
    public int compareTo(Suit t){
        return Integer.valueOf(this.ordinal()).compareTo(t.ordinal());
    }

    public String name(){
        return name;
    }

    public int ordinal(){
        return VALUES.indexOf(this);
    }

    @Override
    public String toString(){
        return name();
    }

    public static Suit valueOf(String name){
        for(Suit value : VALUES){
            if(value.name.equals(name)) return value;
        }
        throw new IllegalArgumentException();
    }

    public static List<Suit> values() {
        return VALUES;
    }
}




