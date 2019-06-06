package Wojna;
import java.text.DecimalFormat;
import java.util.List;

public class Deck {

    private List<Card> cardList;

    public Deck(List<Card> cardList) {
        this.cardList = cardList;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cardList=" + cardList +
                '}';
    }
}
