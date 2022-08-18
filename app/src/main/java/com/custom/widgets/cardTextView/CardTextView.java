package com.custom.widgets.cardTextView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.custom.widgets.R;

public class CardTextView extends LinearLayout {

    private View view;
    private String title;
    private String name;
    private String address;
    private int age;
    private String state;
    private String city;
    private boolean indian;
    private TextView tvText;

    public CardTextView(Context context) {
        this(context,null);
    }

    public CardTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CardTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.CardTextView);
        title = attributes.getString(R.styleable.CardTextView_title);
        name = attributes.getString(R.styleable.CardTextView_name);
        address = attributes.getString(R.styleable.CardTextView_address);
        age = attributes.getInt(R.styleable.CardTextView_age,0);
        state = attributes.getString(R.styleable.CardTextView_state);
        city = attributes.getString(R.styleable.CardTextView_city);
        indian = attributes.getBoolean(R.styleable.CardTextView_indian,false);
        Log.e("TAG", "CardTextView: "+title);
        Log.e("TAG", "Name: "+name);
        Log.e("TAG", "Address: "+address);
        Log.e("TAG", "Age: "+age);
        Log.e("TAG", "State: "+state);
        Log.e("TAG", "City: "+city);
        Log.e("TAG", "Indian: "+indian);
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.card_text_view, this, true);
        tvText=view.findViewById(R.id.tvText);
        attributes.recycle();
    }




}
