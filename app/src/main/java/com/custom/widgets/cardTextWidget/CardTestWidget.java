package com.custom.widgets.cardTextWidget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.custom.widgets.R;
import com.google.android.material.card.MaterialCardView;


public class CardTestWidget extends LinearLayout {
    private MaterialCardView cardView;
    private TextView textView;
    private Context mContext;

    public CardTestWidget(Context mContext) {
        this(mContext, null);
    }

    public CardTestWidget(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CardTestWidget(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initViews();
    }

    private void initViews() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.activity_card_text_widget, this, true);
        cardView = mView.findViewById(R.id.mcv);
        cardView.setRadius(70f);
        cardView=mView.findViewById(R.id.mcvCenter);
        cardView.setRadius(70f);
        textView = mView.findViewById(R.id.tvTextDescription);



    }
}