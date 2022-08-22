package com.custom.widgets.cardimage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.custom.widgets.R;

public class CardImage extends LinearLayout {
    private Context mContext;
    private CardView cardView;
    private ImageView imageView;
    public CardImage(Context mContext) {
        this(mContext,null);
    }

    public CardImage(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CardImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.activtiy_card_image,this,true);
        cardView=mView.findViewById(R.id.mcvImg);
        cardView.setRadius(70f);
        imageView=mView.findViewById(R.id.imv);
    }
}
