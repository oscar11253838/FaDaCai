package com.example.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void lifeClick(View view){
        Intent intent = new Intent(MainActivity.this,lifeMain.class);
        startActivity(intent);
    }

    public void Compound(View view){
        Intent intent = new Intent(MainActivity.this,compoundbutton.class);
        startActivity(intent);
    }

    public void Web(View view){
        Intent intent = new Intent(MainActivity.this,WebView.class);
        startActivity(intent);
    }

    public void Rating(View view){
        Intent intent = new Intent(MainActivity.this,Rating.class);
        startActivity(intent);
    }

    public void SeekBar(View view){
        Intent intent = new Intent(MainActivity.this,Seek.class);
        startActivity(intent);
    }

    public void ScrollBar(View view){
        Intent intent = new Intent(MainActivity.this,Scroll.class);
        startActivity(intent);
    }

    public void Menus(View view){
        Intent intent = new Intent(MainActivity.this,Menus.class);
        startActivity(intent);
    }

    public void Spinner(View view){
        Intent intent = new Intent(MainActivity.this,Spinner.class);
        startActivity(intent);
    }
}
