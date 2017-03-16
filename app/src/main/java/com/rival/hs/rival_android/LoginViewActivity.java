package com.rival.hs.rival_android;

/**
 * Created by Jinseok on 2017-03-07.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;

public class LoginViewActivity extends AppCompatActivity {

    private Spinner Spinner_city;
    private Spinner Spinner_sports;
    ArrayList<HashMap<String, String>> SearchList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);
        listView = (ListView) findViewById(R.id.search_list);
        Button search = (Button) findViewById(R.id.search_button);
        Spinner_city = (Spinner) findViewById(R.id.city_list);
        Spinner_sports = (Spinner) findViewById(R.id.sports_list);

        search.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            }
        });


    }
}
