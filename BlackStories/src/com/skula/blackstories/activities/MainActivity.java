package com.skula.blackstories.activities;

import java.util.NoSuchElementException;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
	private Button btnFirst;
	private Button btnLast;
	
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
		this.btnPrevious.setText("<");
		this.btnPrevious.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				face = FACE_RIDDLE;
				btnTurn.setText("Histoire");
				int pId = card.getId() - 1;
				if(pId == 0){
					btnPrevious.setEnabled(false);
					btnFirst.setEnabled(false);
				}
				btnNext.setEnabled(true);
				btnLast.setEnabled(true);
			
				card = Card.CARDS.get(pId);
				cardPict.setImageResource(card.getDrawableRiddle());
				cardRank.setText(getRank());
			}
		});
		this.btnPrevious.setEnabled(false);
		
		this.btnNext = (Button) findViewById(R.id.btn_next);
		this.btnNext.setText(">");
		this.btnNext.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				face = FACE_RIDDLE;
				btnTurn.setText("Histoire");
				int nId = card.getId() + 1;
				if(nId == Card.CARDS.size()-1){
					btnNext.setEnabled(false);
					btnLast.setEnabled(false);
				}
				btnPrevious.setEnabled(true);
				btnFirst.setEnabled(true);
				
				card = Card.CARDS.get(nId);
				cardPict.setImageResource(card.getDrawableRiddle());
				cardRank.setText(getRank());
			}
		});
		if(Card.CARDS.size() == 1){
			this.btnNext.setEnabled(false);
			this.btnLast.setEnabled(false);
		}
				
		this.btnTurn = (Button) findViewById(R.id.btn_turn);
		this.btnTurn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(face == FACE_RIDDLE){
					face = FACE_STORY;
					btnTurn.setText("Enigme");
					cardPict.setImageResource(card.getDrawableStory());
				}else{
					face = FACE_RIDDLE;
					btnTurn.setText("Histoire");
					cardPict.setImageResource(card.getDrawableRiddle());
				}
				btnNext.setEnabled(true);
				btnLast.setEnabled(true);
			}
		});
		
		this.btnFirst = (Button) findViewById(R.id.btn_first);
		this.btnFirst.setText("<<");
		this.btnFirst.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				face = FACE_RIDDLE;
				btnTurn.setText("Histoire");
				int pId = 0;

				btnPrevious.setEnabled(false);
				btnFirst.setEnabled(false);
				btnNext.setEnabled(true);
				btnLast.setEnabled(true);
			
				card = Card.CARDS.get(pId);
				cardPict.setImageResource(card.getDrawableRiddle());
				cardRank.setText(getRank());
			}
		});
		this.btnFirst.setEnabled(false);
		
		this.btnLast = (Button) findViewById(R.id.btn_last);
		this.btnLast.setText(">>");
		this.btnLast.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				face = FACE_RIDDLE;
				btnTurn.setText("Histoire");
				int nId = Card.CARDS.size()-1;
				
				btnNext.setEnabled(false);
				btnLast.setEnabled(false);
				btnPrevious.setEnabled(true);
				btnFirst.setEnabled(true);
				
				card = Card.CARDS.get(nId);
				cardPict.setImageResource(card.getDrawableRiddle());
				cardRank.setText(getRank());
			}
		});
	}
	
	private String getRank(){
		return "- " +(card.getId()+1) + "/" + Card.CARDS.size() + " -";
	}

	@Override
	public void onBackPressed() {

	}
}