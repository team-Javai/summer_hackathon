package blackjack;

import blackjack.card.Deck;
import blackjack.player.Dealer;
import blackjack.player.Player;
import blackjack.player.AbstractPlayer;


public class game_blackjack {

    public int start() {
        System.out.println("welcome to blackjack");
        System.out.println("game start");

        Deck deck = new Deck();
        AbstractPlayer player = new Player("あなた");
        AbstractPlayer dealer = new Dealer("ディーラー");

        player.initCardList(deck);
        dealer.initCardList(deck);

        player.drawCard(deck);
        dealer.drawCard(deck);

        printGameResult(player, dealer);

        System.out.println("game finish\n");
        System.out.println("Come again!\n");

        if (player.calcScore() == dealer.calcScore()) return 2;
        else if(!player.getIsBurst() && (dealer.getIsBurst() || player.calcScore() > dealer.calcScore())) return 1;
        else  return 0;

    }

    private void printGameResult(AbstractPlayer player, AbstractPlayer dealer) {
        if (player.calcScore() == dealer.calcScore()) {
            System.out.println("引き分け");
        }
        if(!player.getIsBurst() && (dealer.getIsBurst() || player.calcScore() > dealer.calcScore())){
            System.out.println(player.getName() + "の勝利\n");
        } else  System.out.println(player.getName() + "の敗北\n");

    }
}
