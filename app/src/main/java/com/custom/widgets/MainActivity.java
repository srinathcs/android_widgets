package com.custom.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view_learing);
        Button bt=findViewById(R.id.btnSimple);

        TextView myTextView = findViewById(R.id.tvSetText);
        myTextView.setText(R.string.tvSetText);
        myTextView = findViewById(R.id.tvSetText);
        myTextView.setTextColor(myTextView.getResources().getColor(R.color.teal_700));
        myTextView.setTextSize(50);
        myTextView.setBackgroundColor(myTextView.getResources().getColor(R.color.black));
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hai",Toast.LENGTH_SHORT).show();
            }
        });






    }
}