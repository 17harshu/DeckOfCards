package com.cards.workshop;

public class DeckOfCards {
	static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	static String[] deckOfCard = new String[suit.length * rank.length];

	/*
	 * UC1 : Setup the initial game with deck of cards and make sure we have unique
	 * cards
	 * 
	 */
	public void uniqueCards() {
		int index = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deckOfCard[index] = suit[i] + " : " + rank[j];
				index++;
			}
		}
	}

	/*
	 * Display of deck of cards
	 */
	public void displayCards(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Deck of Cards");
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.uniqueCards();
		System.out.println("Unique cards: ");
		deckOfCards.displayCards(deckOfCard);
	}
}
