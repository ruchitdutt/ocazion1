package com.example.ruchitdutt.trulia;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    TextView notSearch;
    ViewPager viewPager;
    CustomSwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        textView=(TextView)findViewById(R.id.textView2);

        notSearch=(TextView)findViewById(R.id.textView3);

        textView.setVisibility(View.INVISIBLE);
        viewPager= (ViewPager)findViewById(R.id.view_pager);
        adapter= new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);



    }
    public void onhomeclick(View view){
        notSearch.setVisibility(View.VISIBLE);
        notSearch.setText("This will serve as the home page");

        textView.setVisibility(View.INVISIBLE);



    }
    public void onsearchclick(View view){
        textView.setVisibility(View.VISIBLE);
        textView.setText("Search");

        notSearch.setVisibility(View.INVISIBLE);

    }
    public void userfeedback(View view){

        textView.setVisibility(View.INVISIBLE);
        notSearch.setVisibility(View.VISIBLE);
        notSearch.setText("Form for User feedback");

    }
    public void onheartclick(View view){

        textView.setVisibility(View.INVISIBLE);
        notSearch.setVisibility(View.VISIBLE);
        notSearch.setText("Favourite");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_overflow, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            return true;
        }
        if (id == R.id.help) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


