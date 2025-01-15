package cardsWithPower_03;


public class Card {
    private CardSuits cardSuit;
    private CardRank cardRank;
    private int power;

    public Card(CardSuits cardSuit, CardRank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
        this.power = this.cardSuit.getSuitPower() + this.cardRank.getRankPower();
    }

    public CardSuits getCardSuit() {
        return cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public int getPower() {
        return this.power;
    }
}
