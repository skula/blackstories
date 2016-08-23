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
		CARDS.add(new Card(0, R.drawable.s1r_01, R.drawable.s1s_01));
		CARDS.add(new Card(1, R.drawable.s1r_02, R.drawable.s1s_02));
		CARDS.add(new Card(2, R.drawable.s1r_03, R.drawable.s1s_03));
		CARDS.add(new Card(3, R.drawable.s1r_04, R.drawable.s1s_04));
		CARDS.add(new Card(4, R.drawable.s2r_01, R.drawable.s2s_01));
		CARDS.add(new Card(5, R.drawable.s2r_02, R.drawable.s2s_02));
		CARDS.add(new Card(6, R.drawable.s2r_03, R.drawable.s2s_03));
		CARDS.add(new Card(7, R.drawable.s2r_04, R.drawable.s2s_04));
		CARDS.add(new Card(8, R.drawable.s3r_01, R.drawable.s3s_01));
		CARDS.add(new Card(9, R.drawable.s3r_02, R.drawable.s3s_02));
		CARDS.add(new Card(10, R.drawable.s3r_03, R.drawable.s3s_03));
		CARDS.add(new Card(11, R.drawable.s3r_04, R.drawable.s3s_04));
		CARDS.add(new Card(12, R.drawable.s4r_01, R.drawable.s4s_01));
		CARDS.add(new Card(13, R.drawable.s4r_02, R.drawable.s4s_02));
		CARDS.add(new Card(14, R.drawable.s4r_03, R.drawable.s4s_03));
		CARDS.add(new Card(15, R.drawable.s4r_04, R.drawable.s4s_04));
		CARDS.add(new Card(16, R.drawable.s5r_01, R.drawable.s5s_01));
		CARDS.add(new Card(17, R.drawable.s5r_02, R.drawable.s5s_02));
		CARDS.add(new Card(18, R.drawable.s5r_03, R.drawable.s5s_03));
		CARDS.add(new Card(19, R.drawable.s5r_04, R.drawable.s5s_04));
		CARDS.add(new Card(20, R.drawable.s6r_01, R.drawable.s6s_01));
		CARDS.add(new Card(21, R.drawable.s6r_02, R.drawable.s6s_02));
		CARDS.add(new Card(22, R.drawable.s6r_03, R.drawable.s6s_03));
		CARDS.add(new Card(23, R.drawable.s6r_04, R.drawable.s6s_04));
		CARDS.add(new Card(24, R.drawable.s7r_01, R.drawable.s7s_01));
		CARDS.add(new Card(25, R.drawable.s7r_02, R.drawable.s7s_02));
		CARDS.add(new Card(26, R.drawable.s7r_03, R.drawable.s7s_03));
		CARDS.add(new Card(27, R.drawable.s7r_04, R.drawable.s7s_04));
		CARDS.add(new Card(28, R.drawable.s8r_01, R.drawable.s8s_01));
		CARDS.add(new Card(29, R.drawable.s8r_02, R.drawable.s8s_02));
		CARDS.add(new Card(30, R.drawable.s8r_03, R.drawable.s8s_03));
		CARDS.add(new Card(31, R.drawable.s8r_04, R.drawable.s8s_04));
		CARDS.add(new Card(32, R.drawable.s9r_01, R.drawable.s9s_01));
		CARDS.add(new Card(33, R.drawable.s9r_02, R.drawable.s9s_02));
		CARDS.add(new Card(34, R.drawable.s9r_03, R.drawable.s9s_03));
		CARDS.add(new Card(35, R.drawable.s9r_04, R.drawable.s9s_04));
		CARDS.add(new Card(36, R.drawable.s10r_01, R.drawable.s10s_01));
		CARDS.add(new Card(37, R.drawable.s10r_02, R.drawable.s10s_02));
		CARDS.add(new Card(38, R.drawable.s10r_03, R.drawable.s10s_03));
		CARDS.add(new Card(39, R.drawable.s10r_04, R.drawable.s10s_04));
		CARDS.add(new Card(40, R.drawable.s11r_01, R.drawable.s11s_01));
		CARDS.add(new Card(41, R.drawable.s11r_02, R.drawable.s11s_02));
		CARDS.add(new Card(42, R.drawable.s11r_03, R.drawable.s11s_03));
		CARDS.add(new Card(43, R.drawable.s11r_04, R.drawable.s11s_04));
		CARDS.add(new Card(44, R.drawable.s12r_01, R.drawable.s12s_01));
		CARDS.add(new Card(45, R.drawable.s12r_02, R.drawable.s12s_02));
		CARDS.add(new Card(46, R.drawable.s12r_03, R.drawable.s12s_03));
		CARDS.add(new Card(47, R.drawable.s12r_04, R.drawable.s12s_04));
		CARDS.add(new Card(48, R.drawable.s13r_01, R.drawable.s13s_01));
		CARDS.add(new Card(49, R.drawable.s13r_02, R.drawable.s13s_02));
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
