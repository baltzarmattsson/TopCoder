public class BlackjackWinner {
    public static int winnings(int bet, int dealer, int dealerBlackjack, int player, int blackjack) {
        // Someone has blackjack
        if (blackjack == 1 || dealerBlackjack == 1) {
            if (dealerBlackjack == 1 && blackjack == 1)
            	return 0;
            else if (dealerBlackjack == 1 && blackjack == 0)
            	return -bet;
            else if (dealerBlackjack == 0 && blackjack == 1)
            	return (int) (bet * 1.5);
        // Noone has blackjack
        } else {
            if (player > 21 || (dealer == 21 && player != 21)
                return -bet;
        }
        return bet;
    }
}