import java.util.*;

public class Blackjack {
    private static final HashMap<String, Integer> CARDS = new HashMap<String, Integer>();
    Blackjack()
    {
        
        CARDS.put("ace",11);
        CARDS.put("two",2);
        CARDS.put("three",3);
        CARDS.put("four",4);
        CARDS.put("five",5);
        CARDS.put("six",6);
        CARDS.put("seven",7);
        CARDS.put("eight",8);
        CARDS.put("nine",9);
        CARDS.put("ten",10);
        CARDS.put("jack",10);
        CARDS.put("queen",10);
        CARDS.put("king",10);
        CARDS.put("other",0);
    }
    


    public int parseCard(String card) {
        return CARDS.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2) == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) return "P";
        return dealerScore >= 10 ? "S" : "W";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) return "S";
        if (handScore <= 11 || dealerScore >= 7) return "H";
        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
    