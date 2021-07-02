package com.example.miwok1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView number = findViewById(R.id.num);
        TextView family= findViewById(R.id.fam);
        TextView color=findViewById(R.id.color);
        TextView phrase=findViewById(R.id.phrase);
        TextView flavours=findViewById(R.id.flav);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntent = new Intent(MainActivity.this, NumbersActitvity.class);

                startActivity(numberIntent);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorIntent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorIntent);
            }
        });
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phraseIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phraseIntent);
            }
        });
        flavours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flavourIntent=new Intent(MainActivity.this,AndroidFlavor.class);
                startActivity(flavourIntent);
            }
        });



    }

}