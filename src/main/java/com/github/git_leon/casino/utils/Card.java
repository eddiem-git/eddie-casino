package com.github.git_leon.casino.utils;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Integer getPrimaryValue() {
        return rank.getPrimaryValue();
    }

    public Integer getSecondaryValue() {
        return rank.getPrimaryValue();
    }

    public String toString() {
        return getRank().name() + " of " + getSuit().name();
    }
}