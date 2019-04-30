package com.github.git_leon.casino.utils;

import java.util.List;
import java.util.Stack;

public class Deck {
    private Long deckId;
    private List<Card> cardList;

    public Deck(List<Card> cardStack) {
        this.cardList = cardStack;
    }

    public Deck() {
        this(new Stack<Card>());
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                push(new Card(rank, suit));
            }
        }
    }

    public Card pop() {
        Card firstCard = cardList.get(0);
        cardList.remove(firstCard);
        return firstCard;
    }

    public void push(Card card) {
        cardList.add(card);
    }

    public Card peek() {
        return cardList.get(0);
    }

    public Boolean isEmpty() {
        return cardList.isEmpty();
    }

    public Long getDeckId() {
        return deckId;
    }

    public void setDeckId(Long deckId) {
        this.deckId = deckId;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
