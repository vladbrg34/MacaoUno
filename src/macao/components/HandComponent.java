package macao.components;

import core.Component;
import macao.model.Card;

import java.util.ArrayList;
import java.util.List;

public class HandComponent extends Component{
	public final List<Card> cards = new ArrayList<>();

	@Override
	public void update (float dt) {
	}
}
