package com.custom.widgets;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.custom.widgets.whatsapp.settings.UserShotInfo;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private EditText editText;
    private TextView myTextView;
    private UserShotInfo mUserShotInfo,mUserShotInfo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view_learing);
        initViews();
       /* onButtonSetup();
        onTextSetup();
        onEditSetup();
        onSetupEvent();*/

    }

    private void initViews(){
        //bt=findViewById(R.id.btnSimple);
        //editText=findViewById(R.id.etText);
        //myTextView = findViewById(R.id.tvSetText);
        mUserShotInfo=findViewById(R.id.usiwInfo);
        mUserShotInfo1=findViewById(R.id.usiwInfo1);
        mUserShotInfo.setTitle("Sri");
        mUserShotInfo1.setTitle("Aravinth");
        mUserShotInfo.setDescription("hai");
        mUserShotInfo1.setDescription("hello");


    }


    }

    /*private void onButtonSetup(){
        bt.setBackgroundTintList(getResources().getColorStateList(R.color.button_background));
        bt.setText("new");
        Drawable img = bt.getContext().getResources().getDrawable( R.drawable.ic_launcher_foreground );
        bt.setCompoundDrawablesWithIntrinsicBounds( null, null, img, null);
        bt.setTextColor(0xffff0000);
        bt.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        GradientDrawable shape = new GradientDrawable();
        shape.setCornerRadius(50);
        bt.setBackgroundDrawable(shape);
    }

    private void onTextSetup(){
        myTextView.setText(R.string.tvSetText);
        //myTextView = findViewById(R.id.tvSetText);
        myTextView.setTextColor(myTextView.getResources().getColor(R.color.teal_700));
        myTextView.setTextSize(50);
        myTextView.setBackgroundColor(myTextView.getResources().getColor(R.color.black));
    }
    private void onEditSetup(){
        editText.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        editText.setTextColor(Color.BLUE);
        editText.setTextSize(25);

    }

    private void onSetupEvent(){
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hai",Toast.LENGTH_SHORT).show();
            }
        });*/





