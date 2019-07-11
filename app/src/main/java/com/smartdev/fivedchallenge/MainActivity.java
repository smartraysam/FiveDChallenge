package com.smartdev.fivedchallenge;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button butAbt, butProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        butAbt = findViewById(R.id.butAbt);
        butProfile= findViewById(R.id.butProf);
        butAbt.setOnClickListener(this);
        butProfile.setOnClickListener(this);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
     public void onClick(View v){
        if(v == butAbt){
            Intent abut = new Intent(getApplicationContext(), AboutActivity.class);
            abut.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(abut);
        }else if(v== butProfile){
            Intent profile = new Intent(getApplicationContext(), ProfileActivity.class);
            profile.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(profile);
        }

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
