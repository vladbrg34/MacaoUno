package macao.model;

public enum Suit {
	HEARTS("♥"),
	DIAMONDS("♦"),
	CLUBS("♣"),
	SPADES("♠");

	private final String display;

	Suit(String display) {
		this.display = display;
	}

	public String getDisplay() {
		return display;
	}
}

