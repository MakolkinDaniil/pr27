package ru.startandroid.develop.pr27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button)findViewById(R.id.button);
        Button button3 = (Button)findViewById(R.id.button3);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent i;
        i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }
    public void onClick2(View v){
        Intent i2;
        i2 = new Intent(this, MainActivity4.class);
        startActivity(i2);
    }
}