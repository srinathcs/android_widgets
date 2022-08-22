package com.custom.widgets.whatsapp.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;

import com.custom.widgets.R;

import java.text.BreakIterator;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserShotInfo extends LinearLayout {
    Context mContext;
    AppCompatTextView tvTitle,tvDescription;
    CircleImageView civProfile;
    public UserShotInfo(Context mContext) {
        this(mContext,null);
    }

    public UserShotInfo(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public UserShotInfo(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView(){
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.user_short_info_widget,this,true);
        tvTitle=mView.findViewById(R.id.tvTitle);
        tvDescription=mView.findViewById(R.id.tvDescription);
        civProfile=mView.findViewById(R.id.imgDp);

    }

    public void setTitle(String title){
        tvTitle.setText(title);
    }
    public void setDescription(String description){
        tvDescription.setText(description);
    }
    }

