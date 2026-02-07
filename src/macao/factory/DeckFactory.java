package macao.factory;

import macao.model.Card;
import macao.model.Rank;
import macao.model.Suit;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory {

	private DeckFactory() {
	}

	public static List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(54);

		for (Rank rank : Rank.values()) {
			if (rank == Rank.JOKER) {
				deck.add(new Card(Suit.WILD, Rank.JOKER));
				deck.add(new Card(Suit.WILD, Rank.JOKER));
				continue;
			}

			for (Suit suit : Suit.values()) {
				if (suit == Suit.WILD) continue;
				deck.add(new Card(suit, rank));
			}
		}
		return deck;
	}
}
