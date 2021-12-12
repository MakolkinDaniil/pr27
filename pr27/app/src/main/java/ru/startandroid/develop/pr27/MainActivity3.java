package ru.startandroid.develop.pr27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageButton menu = (ImageButton) findViewById(R.id.menu);
        menu.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent i;
        i = new Intent(this, MainActivity5.class);
        startActivity(i);
    }
}