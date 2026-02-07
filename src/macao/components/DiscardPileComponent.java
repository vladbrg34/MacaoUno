package macao.components;

import core.Component;
import macao.model.Card;

import java.util.ArrayDeque;
import java.util.Deque;

public class DiscardPileComponent extends Component {
	public final Deque<Card> discardedCards = new ArrayDeque<>();

	@Override
	public void update (float dt) {
	}
}
