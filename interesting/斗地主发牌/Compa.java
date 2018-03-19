package com.itheima;

import java.util.Comparator;

public class Compa implements Comparator<Card> {

	@Override
	public int compare(Card o1, Card o2) {
		return o2.getId() - o1.getId();
	}

}
