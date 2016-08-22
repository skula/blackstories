package com.skula.blackstories.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.skula.blackstories.R;
import com.skula.blackstories.models.Card;



public class MainActivity extends Activity {
	private static final int FACE_RIDDLE = 0;
	private static final int FACE_STORY = 1;
	private TextView cardRank;
	private ImageView cardPict;
	private Button btnPrevious;
	private Button btnNext;
	private Button btnTurn;
	
	private Card card;
	private int face;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		this.face = FACE_RIDDLE;
		this.card = Card.CARDS.get(0);
		this.cardPict = (ImageView)findViewById(R.id.card_pict);
		this.cardPict.setImageResource(card.getDrawableRiddle());
		
		this.cardRank = (TextView)findViewById(R.id.card_rank);
		this.cardRank.setText(getRank());
		
		this.btnPrevious = (Button) findViewById(R.id.btn_previous);
		this.btnPrevious.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				face = FACE_RIDDLE;
				int pId = card.getId() - 1;
				if(pId == 0){
					btnPrevious.setEnabled(false);
				}
				btnNext.setEnabled(true);
			
				card = Card.CARDS.get(pId);
				cardPict.setImageResource(card.getDrawableRiddle());
				cardRank.setText(getRank());
			}
		});
		this.btnPrevious.setEnabled(false);
		
		this.btnNext = (Button) findViewById(R.id.btn_next);
		this.btnNext.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				face = FACE_RIDDLE;
				int nId = card.getId() + 1;
				if(nId == Card.CARDS.size() -1){
					btnNext.setEnabled(false);
				}
				btnPrevious.setEnabled(true);
				
				card = Card.CARDS.get(nId);
				cardPict.setImageResource(card.getDrawableRiddle());
				cardRank.setText(getRank());
			}
		});
		if(Card.CARDS.size() == 1){
			this.btnNext.setEnabled(false);
		}
				
		this.btnTurn = (Button) findViewById(R.id.btn_turn);
		this.btnTurn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(face == FACE_RIDDLE){
					face = FACE_STORY;
					cardPict.setImageResource(card.getDrawableStory());
				}else{
					face = FACE_RIDDLE;
					cardPict.setImageResource(card.getDrawableRiddle());
				}
			}
		});
		
	}
	
	private String getRank(){
		return (card.getId()+1) + "/" + Card.CARDS.size();
	}

	@Override
	public void onBackPressed() {

	}
}