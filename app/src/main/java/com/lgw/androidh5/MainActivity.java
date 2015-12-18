package com.lgw.androidh5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    private Button btn_one, btn_two, btn_three, btn_four;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment_one fragment_one = Singleton.getOne();
                getFragmentManager().beginTransaction().replace(R.id.top_layout, fragment_one).commit();
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment_two fragment_two = Singleton.getTwo();
                getFragmentManager().beginTransaction().replace(R.id.top_layout, fragment_two).commit();
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment_three fragment_three = Singleton.getThree();
                getFragmentManager().beginTransaction().replace(R.id.top_layout, fragment_three).commit();
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment_four fragment_four = Singleton.getFour();
                getFragmentManager().beginTransaction().replace(R.id.top_layout, fragment_four).commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
