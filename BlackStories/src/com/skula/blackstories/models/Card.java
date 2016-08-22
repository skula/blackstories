package com.skula.blackstories.models;
import java.util.ArrayList;
import java.util.List;

import com.skula.blackstories.R;


public class Card {
	private int id;
	private int drawableRiddle;
	private int drawableStory;

	public static List<Card> CARDS;
	static{
		CARDS = new ArrayList<Card>();
		CARDS.add(new Card(1, R.drawable.c1r, R.drawable.c1s));
		CARDS.add(new Card(2, R.drawable.c2r, R.drawable.c2s));
		/*CARDS.add(new Card(3, R.drawable.c3r, R.drawable.c3s));
		CARDS.add(new Card(4, R.drawable.c4r, R.drawable.c4s));
		CARDS.add(new Card(5, R.drawable.c5r, R.drawable.c5s));
		CARDS.add(new Card(6, R.drawable.c6r, R.drawable.c6s));
		CARDS.add(new Card(7, R.drawable.c7r, R.drawable.c7s));
		CARDS.add(new Card(8, R.drawable.c8r, R.drawable.c8s));
		CARDS.add(new Card(9, R.drawable.c9r, R.drawable.c9s));
		CARDS.add(new Card(10, R.drawable.c10r, R.drawable.c10s));
		CARDS.add(new Card(11, R.drawable.c11r, R.drawable.c11s));
		CARDS.add(new Card(12, R.drawable.c12r, R.drawable.c12s));
		CARDS.add(new Card(13, R.drawable.c13r, R.drawable.c13s));
		CARDS.add(new Card(14, R.drawable.c14r, R.drawable.c14s));
		CARDS.add(new Card(15, R.drawable.c15r, R.drawable.c15s));
		CARDS.add(new Card(16, R.drawable.c16r, R.drawable.c16s));
		CARDS.add(new Card(17, R.drawable.c17r, R.drawable.c17s));
		CARDS.add(new Card(18, R.drawable.c18r, R.drawable.c18s));
		CARDS.add(new Card(19, R.drawable.c19r, R.drawable.c19s));
		CARDS.add(new Card(20, R.drawable.c20r, R.drawable.c20s));
		CARDS.add(new Card(21, R.drawable.c21r, R.drawable.c21s));
		CARDS.add(new Card(22, R.drawable.c22r, R.drawable.c22s));
		CARDS.add(new Card(23, R.drawable.c23r, R.drawable.c23s));
		CARDS.add(new Card(24, R.drawable.c24r, R.drawable.c24s));
		CARDS.add(new Card(25, R.drawable.c25r, R.drawable.c25s));
		CARDS.add(new Card(26, R.drawable.c26r, R.drawable.c26s));
		CARDS.add(new Card(27, R.drawable.c27r, R.drawable.c27s));
		CARDS.add(new Card(28, R.drawable.c28r, R.drawable.c28s));
		CARDS.add(new Card(29, R.drawable.c29r, R.drawable.c29s));
		CARDS.add(new Card(30, R.drawable.c30r, R.drawable.c30s));
		CARDS.add(new Card(31, R.drawable.c31r, R.drawable.c31s));
		CARDS.add(new Card(32, R.drawable.c32r, R.drawable.c32s));
		CARDS.add(new Card(33, R.drawable.c33r, R.drawable.c33s));
		CARDS.add(new Card(34, R.drawable.c34r, R.drawable.c34s));
		CARDS.add(new Card(35, R.drawable.c35r, R.drawable.c35s));
		CARDS.add(new Card(36, R.drawable.c36r, R.drawable.c36s));
		CARDS.add(new Card(37, R.drawable.c37r, R.drawable.c37s));
		CARDS.add(new Card(38, R.drawable.c38r, R.drawable.c38s));
		CARDS.add(new Card(39, R.drawable.c39r, R.drawable.c39s));
		CARDS.add(new Card(40, R.drawable.c40r, R.drawable.c40s));
		CARDS.add(new Card(41, R.drawable.c41r, R.drawable.c41s));
		CARDS.add(new Card(42, R.drawable.c42r, R.drawable.c42s));
		CARDS.add(new Card(43, R.drawable.c43r, R.drawable.c43s));
		CARDS.add(new Card(44, R.drawable.c44r, R.drawable.c44s));
		CARDS.add(new Card(45, R.drawable.c45r, R.drawable.c45s));
		CARDS.add(new Card(46, R.drawable.c46r, R.drawable.c46s));
		CARDS.add(new Card(47, R.drawable.c47r, R.drawable.c47s));
		CARDS.add(new Card(48, R.drawable.c48r, R.drawable.c48s));
		CARDS.add(new Card(49, R.drawable.c49r, R.drawable.c49s));*/
	}
	
	public Card(int id, int drawableRiddle, int drawableStory){
		this.id = id;
		this.drawableRiddle = drawableRiddle;
		this.drawableStory = drawableStory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDrawableRiddle() {
		return drawableRiddle;
	}

	public void setDrawableRiddle(int drawableRiddle) {
		this.drawableRiddle = drawableRiddle;
	}

	public int getDrawableStory() {
		return drawableStory;
	}

	public void setDrawableStory(int drawableStory) {
		this.drawableStory = drawableStory;
	}
}
