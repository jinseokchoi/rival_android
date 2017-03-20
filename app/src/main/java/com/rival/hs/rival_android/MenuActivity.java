package com.rival.hs.rival_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HeeJoongKim on 2017-03-18.
 */

public class MenuActivity extends AppCompatActivity {
    Button footballButton;
    Button baseballButton;
    Button basketballButton;
    Button volleyfootballButton;
    Button billiardButton;
    Button bowingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // FootballButton
        footballButton = (Button)findViewById(R.id.footballButton);
        footballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
        //BaseballButton
        baseballButton = (Button)findViewById(R.id.baseballButton);
        baseballButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
        //BasketballButton
        basketballButton = (Button)findViewById(R.id.basketballButton);
        basketballButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
        //VolleyfootballButton
        volleyfootballButton = (Button)findViewById(R.id.volleyfootballButton);
        volleyfootballButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
        //BilliardsButton
        billiardButton = (Button)findViewById(R.id.billiardButton);
        billiardButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
        //BowingButton
        bowingButton = (Button)findViewById(R.id.bowingButton);
        bowingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MenuActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

    }
}
