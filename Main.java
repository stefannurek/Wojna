package Wojna;

import com.sun.xml.internal.ws.model.ReflectAnnotationReader;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Deck with 5 cards, seed 10: ");

        System.out.println(createDeck());
        createRandomCard();

        RarityBattle rarityBattle = new RarityBattle();
        rarityBattle.checkWinner(createDeck(), createDeck());


    }

    private static Deck createDeck(){
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Card card = createRandomCard();
            cards.add(card);
        }
        Deck deck = new Deck(cards);
        return deck;
    }

    private static Card createRandomCard(){

        Random random = new Random();
        int randomNumber = random.nextInt(10) +1;
        System.out.println(randomNumber);

        int randomColorNumber = random.nextInt(4);
        CardColor cardColor = CardColor.values()[randomColorNumber];
//        System.out.println("Wylosowany numer koloru to: " + randomColorNumber);
//        System.out.println(cardColor);

        boolean isRare = random.nextBoolean();

        Card card = new Card(cardColor, randomNumber, isRare);

//        System.out.println("Wylosowana karta: " + card);

        return card;
    }
}
