package com.custom.widgets.cardEditImage;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.custom.widgets.R;
import com.google.android.material.card.MaterialCardView;

public class CardEditImage extends LinearLayout {
    private Context mContext;
    private MaterialCardView cardView;
    private TextView textView;
    private EditText editText;
    private ImageView imageView;

    public CardEditImage(Context mContext) {
        this(mContext,null);
    }

    public CardEditImage(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CardEditImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        intiView();
    }
    private void intiView(){
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.activity_card_edit_image,this,true);
        cardView=mView.findViewById(R.id.mcvAll);
        cardView.setRadius(70f);
        editText=mView.findViewById(R.id.etText);
        textView=mView.findViewById(R.id.tvAll);

    }


}
