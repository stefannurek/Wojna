package Wojna;

public class RarityBattle implements Battle{

    @Override
    public int checkWinner(Deck deck, Deck secondDeck){

        RarityBattle rarityBattle = new RarityBattle();
        int numberOfRareCardsInDeckOne = calculateRareCardNumber(deck);
        int numberOfRareCardsInDeckTwo = calculateRareCardNumber(secondDeck);

        if(numberOfRareCardsInDeckOne < numberOfRareCardsInDeckTwo){
            System.out.println("Zwyciezyla talia numer 1 !");
            System.out.println("Liczba kart rzadkich: " + numberOfRareCardsInDeckOne);
            return 1;
        }else if (numberOfRareCardsInDeckOne < numberOfRareCardsInDeckTwo){
            System.out.println("Zwyciezyla talia numer 2 !");
            System.out.println("Liczba kart rzadkich: " + numberOfRareCardsInDeckTwo);
            return 2;
        }else {
            System.out.println("REMIS");
            System.out.println("Liczba kart rzadkich talii 1: ");
            System.out.println("Liczba kast rzadkich talii 2: ");

            return 0;
        }
    }

    private static int calculateRareCardNumber(Deck deck){
        int counter =0;

        for(Card card : deck.getCardList()) {

            if(card.isRare()){
                counter++;
            }
        }
        return counter;
    }
}
