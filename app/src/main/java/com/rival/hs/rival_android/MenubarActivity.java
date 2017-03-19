//package com.rival.hs.rival_android;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by HeeJoongKim on 2017-03-18.
 */



//public class MenubarActivity extends AppCompatActivity {
//    ActionBarDrawerToggle drawerToggle;
//    private String[] drawer_str = {"Brown", "Cadet Blue", "Dark Olive Green",
//            "Dark Orange", "Golden Rod"};
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.layout);
//
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.drawerlayout);
//        ListView listView=(ListView)findViewById(R.id.drawer);
//        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,drawer_str);
//        listView.setAdapter(adapter);
//        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close){
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//            }
//            @Override
//            public void onDrawerClosed(View drawerView) {
//                super.onDrawerClosed(drawerView);
//            }
//
//        };
//
//        drawerLayout.setDrawerListener(drawerToggle);
//
//        drawerLayout.closeDrawer(listView);
//    }
//    @Override
//    protected void onPostCreate(Bundle savedInstanceState) {
//        super.onPostCreate(savedInstanceState);
//        drawerToggle.syncState();
//    }
//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        drawerToggle.onConfigurationChanged(newConfig);
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(drawerToggle.onOptionsItemSelected(item))
//            return true;
//        return super.onOptionsItemSelected(item);
//    }
//
//}
